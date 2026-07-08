package Y;

import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C953760avW;
import X.C953770avX;
import X.C971050bNP;
import X.C971360bNu;
import X.DialogC971210bNf;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class ACallableS91S0400000_15 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS91S0400000_15 aCallableS91S0400000_15) {
        C953770avX c953770avX;
        String strStore;
        NLEBranch branch;
        NLECommit head;
        String uuid;
        C1C7U.LIZ("TemplateEditDialog@4388.updateTranslatedTextsAndCapture$1$1$1");
        Bitmap bitmap = (Bitmap) aCallableS91S0400000_15.l0;
        if (bitmap != null) {
            List list = (List) aCallableS91S0400000_15.l1;
            DialogC971210bNf dialogC971210bNf = (DialogC971210bNf) aCallableS91S0400000_15.l2;
            c953770avX = (C953770avX) aCallableS91S0400000_15.l3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get bitmap successfully, translatedTextList: ");
            sbLIZ.append(list);
            C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
            C971050bNP c971050bNP = dialogC971210bNf.LLJZ;
            NLEEditor nLEEditor = c971050bNP.LIZJ;
            if (nLEEditor != null) {
                nLEEditor.commit();
            }
            NLEEditor nLEEditor2 = c971050bNP.LIZJ;
            if (nLEEditor2 != null) {
                nLEEditor2.done();
            }
            c953770avX.LIZJ = System.currentTimeMillis();
            NLEEditor nLEEditor3 = c971050bNP.LIZJ;
            String str = "";
            if (nLEEditor3 == null || (strStore = nLEEditor3.store()) == null) {
                strStore = "";
            }
            c953770avX.LJIIJ = strStore;
            NLEEditor nLEEditor4 = c971050bNP.LIZJ;
            if (nLEEditor4 != null && (branch = nLEEditor4.getBranch()) != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null) {
                str = uuid;
            }
            c953770avX.LJII = str;
            C953760avW.LIZIZ.LIZ().LJIILL(c953770avX, bitmap);
        } else {
            c953770avX = null;
        }
        C1C7U.LIZIZ("TemplateEditDialog@4388.updateTranslatedTextsAndCapture$1$1$1");
        return c953770avX;
    }

    public static final Object call$1(ACallableS91S0400000_15 aCallableS91S0400000_15) {
        Object objInvoke;
        C1C7U.LIZ("NoticeboardEditorOfficial@3b7a.updateTranslatedTextsAndCapture$1$2$1");
        Bitmap bitmap = (Bitmap) aCallableS91S0400000_15.l0;
        if (bitmap != null) {
            List list = (List) aCallableS91S0400000_15.l1;
            Function2 function2 = (Function2) aCallableS91S0400000_15.l2;
            C953770avX c953770avX = (C953770avX) aCallableS91S0400000_15.l3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get bitmap successfully, translatedTextList: ");
            sbLIZ.append(list);
            C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
            objInvoke = function2.invoke(c953770avX, bitmap);
        } else {
            objInvoke = null;
        }
        C1C7U.LIZIZ("NoticeboardEditorOfficial@3b7a.updateTranslatedTextsAndCapture$1$2$1");
        return objInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS91S0400000_15(Object obj, Bitmap bitmap, List<C971360bNu> list, DialogC971210bNf dialogC971210bNf, C953770avX c953770avX) {
        this.$t = c953770avX;
        this.l0 = obj;
        this.l1 = bitmap;
        this.l2 = list;
        this.l3 = dialogC971210bNf;
    }
}
