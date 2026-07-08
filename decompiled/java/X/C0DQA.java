package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DQA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment$multiImagePreviewAbility$1$downloadVideo$2", f = "TakoSharePageFragment.kt", l = {245}, m = "invokeSuspend")
public final class C0DQA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1845270y7R LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DQA(View view, C1845270y7R c1845270y7R, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1845270y7R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DQA(this.LLILLJJLI, this.LLILZIL, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C1C7U.LIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$downloadVideo$2");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1845270y7R c1845270y7R = this.LLILZIL;
            String str = this.LLILZ;
            Map<String, String> map = c1845270y7R.params;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("media_type", "video");
            linkedHashMap.put("url", str);
            linkedHashMap.put("message_id", c1845270y7R.msgId);
            linkedHashMap.put("source", "post_panel");
            Context context = this.LLILLJJLI.getContext();
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            this.LL = 1;
            obj = C12FQ.LIZIZ(context, str2, str3, linkedHashMap, this, true);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$downloadVideo$2");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            i = 2131849899;
        } else {
            i = 2131822519;
        }
        if (zBooleanValue) {
            i2 = R.raw.icon_tick_circle_fill;
        } else {
            i2 = R.raw.icon_exclamation_mark_circle_fill;
        }
        C0DQF.LJII(C0DQF.LIZ, this.LLILLJJLI, i, C2286608xc.LJ(i2), C2286608xc.LJ(R.attr.a1h), 16);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$downloadVideo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
