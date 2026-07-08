package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoDetailActivity;
import com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoPlayerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DKU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoDetailActivity$onCreate$1", f = "TakoVideoDetailActivity.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0DKU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoVideoDetailActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DKU(TakoVideoDetailActivity takoVideoDetailActivity, InterfaceC1364105Vn<? super C0DKU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoVideoDetailActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DKU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TakoVideoDetailActivity@7eec.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C0DKV c0dkv = new C0DKV(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0dkv);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoVideoDetailActivity@7eec.onCreate$1");
                return objLJFF;
            }
        }
        C1845270y7R c1845270y7R = (C1845270y7R) obj;
        if (c1845270y7R == null) {
            this.LLILLJJLI.finish();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoVideoDetailActivity@7eec.onCreate$1");
            return unit;
        }
        TakoVideoDetailActivity takoVideoDetailActivity = this.LLILLJJLI;
        takoVideoDetailActivity.getClass();
        TakoVideoPlayerFragment takoVideoPlayerFragment = new TakoVideoPlayerFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "video_data", c1845270y7R);
        takoVideoPlayerFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = takoVideoDetailActivity.getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.video_detail_root, takoVideoPlayerFragment, null);
        c19ehLJIIJ.LJIIJ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoVideoDetailActivity@7eec.onCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
