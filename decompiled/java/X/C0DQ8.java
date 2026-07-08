package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoPlayerFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.0DQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoPlayerFragment$onViewCreated$6$2$2", f = "TakoVideoPlayerFragment.kt", l = {360}, m = "invokeSuspend")
public final class C0DQ8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ WeakReference<View> LLILZ;
    public final /* synthetic */ TakoVideoPlayerFragment LLILZIL;
    public final /* synthetic */ C197039127h LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DQ8(String str, String str2, WeakReference<View> weakReference, TakoVideoPlayerFragment takoVideoPlayerFragment, C197039127h c197039127h, InterfaceC1364105Vn<? super C0DQ8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = weakReference;
        this.LLILZIL = takoVideoPlayerFragment;
        this.LLILZLL = c197039127h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DQ8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Map<String, String> map;
        int i;
        int i2;
        C1C7U.LIZ("TakoVideoPlayerFragment@7513.onViewCreated$6$2$2");
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
            TakoVideoPlayerFragment takoVideoPlayerFragment = this.LLILZIL;
            String str2 = this.LLILLL;
            C1845270y7R c1845270y7R = takoVideoPlayerFragment.LLIZLLLIL;
            if (c1845270y7R != null && (map = c1845270y7R.params) != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("media_type", "video");
            linkedHashMap.put("url", str2);
            C1845270y7R c1845270y7R2 = takoVideoPlayerFragment.LLIZLLLIL;
            if (c1845270y7R2 != null) {
                str = c1845270y7R2.msgId;
            } else {
                str = null;
            }
            linkedHashMap.put("message_id", str);
            linkedHashMap.put("source", "post_panel");
            Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
            String str3 = this.LLILLJJLI;
            String str4 = this.LLILLL;
            this.LL = 1;
            obj = C12FQ.LIZIZ(applicationContext, str3, str4, linkedHashMap, this, true);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoVideoPlayerFragment@7513.onViewCreated$6$2$2");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        View view = this.LLILZ.get();
        if (view != null) {
            TakoVideoPlayerFragment takoVideoPlayerFragment2 = this.LLILZIL;
            C197039127h c197039127h = this.LLILZLL;
            if (zBooleanValue) {
                i = 2131849899;
            } else {
                C07QI.LIZ.getClass();
                if (C07QI.LIZ()) {
                    i = 2131822519;
                } else {
                    i = 2131849900;
                }
            }
            if (zBooleanValue) {
                i2 = R.raw.icon_tick_circle_fill;
            } else {
                i2 = R.raw.icon_exclamation_mark_circle_fill;
            }
            C0DQF.LJII(C0DQF.LIZ, view, i, C2286608xc.LJ(i2), C2286608xc.LJ(R.attr.a1h), 16);
            takoVideoPlayerFragment2.getClass();
            ((C197039127h) view).setLoading(false);
            C07QI.LIZ.getClass();
            if (C07QI.LIZ()) {
                c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 353));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoVideoPlayerFragment@7513.onViewCreated$6$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
