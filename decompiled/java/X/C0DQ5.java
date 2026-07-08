package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0DQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment$multiImagePreviewAbility$1$postVideo$2", f = "TakoSharePageFragment.kt", l = {271}, m = "invokeSuspend")
public final class C0DQ5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ TakoSharePageFragment LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1845270y7R LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DQ5(TakoSharePageFragment takoSharePageFragment, String str, String str2, C1845270y7R c1845270y7R, InterfaceC1364105Vn<? super C0DQ5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoSharePageFragment;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c1845270y7R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DQ5(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        View view;
        C1C7U.LIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$postVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                view = (View) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            view = this.LLILLL.getView();
            if (view == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$postVideo$2");
                return unit;
            }
            Context context = view.getContext();
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1845270y7R c1845270y7R = this.LLILZLL;
            String str3 = this.LLILZIL;
            Map<String, String> map = c1845270y7R.params;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("media_type", "video");
            linkedHashMap.put("url", str3);
            linkedHashMap.put("message_id", c1845270y7R.msgId);
            linkedHashMap.put("source", "post_panel");
            this.LL = view;
            this.LLILLJJLI = 1;
            obj = C12FM.LIZIZ(context, view, str, str2, linkedHashMap, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$postVideo$2");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        String str4 = (String) pair.getSecond();
        if (zBooleanValue && str4 != null && str4.length() != 0) {
            Context context2 = view.getContext();
            C1845270y7R c1845270y7R2 = this.LLILZLL;
            C12FM.LIZ(context2, str4, c1845270y7R2.msgId, c1845270y7R2.params, c1845270y7R2.hashTags);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$postVideo$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
