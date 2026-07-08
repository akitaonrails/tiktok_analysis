package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C971020bNM extends C2217421BqW implements Function2<C953770avX, Bitmap, C953770avX> {
    public C971020bNM(InterfaceC971180bNc interfaceC971180bNc) {
        super(2, interfaceC971180bNc, C971040bNO.class, "updateDraftItemByBitmap", "updateDraftItemByBitmap(Lcom/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/draft/DraftItem;Landroid/graphics/Bitmap;)Lcom/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/draft/DraftItem;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C953770avX invoke(C953770avX c953770avX, Bitmap bitmap) {
        String strStore;
        NLEBranch branch;
        NLECommit head;
        String uuid;
        C953770avX c953770avX2 = c953770avX;
        Bitmap bitmap2 = bitmap;
        C971040bNO c971040bNO = (C971040bNO) this.receiver;
        NLEEditor nLEEditor = c971040bNO.LIZIZ;
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
        NLEEditor nLEEditor2 = c971040bNO.LIZIZ;
        if (nLEEditor2 != null) {
            nLEEditor2.done();
        }
        c953770avX2.LIZJ = System.currentTimeMillis();
        NLEEditor nLEEditor3 = c971040bNO.LIZIZ;
        String str = "";
        if (nLEEditor3 == null || (strStore = nLEEditor3.store()) == null) {
            strStore = "";
        }
        c953770avX2.LJIIJ = strStore;
        NLEEditor nLEEditor4 = c971040bNO.LIZIZ;
        if (nLEEditor4 != null && (branch = nLEEditor4.getBranch()) != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null) {
            str = uuid;
        }
        c953770avX2.LJII = str;
        C953760avW.LIZIZ.LIZ().LJIILL(c953770avX2, bitmap2);
        return c953770avX2;
    }
}
