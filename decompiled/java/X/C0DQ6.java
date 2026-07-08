package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0DQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment$contentPreviewAbility$1$postVideo$2", f = "TakoBaseFragment.kt", l = {2222}, m = "invokeSuspend")
public final class C0DQ6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1845270y7R LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ TakoBaseFragment LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1845270y7R LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DQ6(TakoBaseFragment takoBaseFragment, String str, String str2, C1845270y7R c1845270y7R, InterfaceC1364105Vn<? super C0DQ6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = takoBaseFragment;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = c1845270y7R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DQ6(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        View view;
        C1845270y7R c1845270y7R;
        C1C7U.LIZ("TakoBaseFragment@5860.contentPreviewAbility$1$postVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                view = (View) this.LLILLJJLI;
                c1845270y7R = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            view = this.LLILZ.LLJJIII;
            if (view != null) {
                String str = this.LLILZIL;
                String str2 = this.LLILZLL;
                c1845270y7R = this.LLIZ;
                Context context = view.getContext();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> map = c1845270y7R.params;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                linkedHashMap.put("media_type", "video");
                linkedHashMap.put("url", str2);
                linkedHashMap.put("message_id", c1845270y7R.msgId);
                linkedHashMap.put("source", "post_panel");
                this.LL = c1845270y7R;
                this.LLILLJJLI = view;
                this.LLILLL = 1;
                obj = C12FM.LIZIZ(context, view, str, str2, linkedHashMap, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoBaseFragment@5860.contentPreviewAbility$1$postVideo$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoBaseFragment@5860.contentPreviewAbility$1$postVideo$2");
            return unit;
        }
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        String str3 = (String) pair.getSecond();
        if (zBooleanValue && C123100dR.LIZ(str3)) {
            C12FM.LIZ(view.getContext(), str3, c1845270y7R.msgId, c1845270y7R.params, c1845270y7R.hashTags);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoBaseFragment@5860.contentPreviewAbility$1$postVideo$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
