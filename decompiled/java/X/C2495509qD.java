package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$checkAddValid$1$1", f = "VideoChosenResultFromAddSceneImpl.kt", l = {}, m = "invokeSuspend")
public final class C2495509qD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C536080L0s LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<MediaModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2495509qD(C536080L0s c536080L0s, boolean z, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C2495509qD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c536080L0s;
        this.LLILLL = z;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2495509qD c2495509qD = new C2495509qD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2495509qD.LL = obj;
        return c2495509qD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Resources resources;
        int i;
        C1C7U.LIZ("VideoChosenResultFromAddSceneImpl@77d1.checkAddValid$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        this.LLILLJJLI.LIZLLL();
        String string = null;
        if (C2296808zG.LJI(interfaceC497601wk) && this.LLILLL) {
            C536080L0s c536080L0s = this.LLILLJJLI;
            List<MediaModel> list = this.LLILZ;
            c536080L0s.getClass();
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("key_choose_media_data", new ArrayList<>(list));
            C2204961BRm.LJIIL(-1, c536080L0s.LL, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPpNNMOSh4RrNHWQa6q78DLXPjiLrLvb8ajrKmluJQKZx4=", null));
            Activity activity = c536080L0s.LL;
            if (activity instanceof MvChoosePhotoActivity) {
                BaseActivity baseActivity = (BaseActivity) activity;
                baseActivity.finish();
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (C1389600mGU.LIZIZ(baseActivity)) {
                    i = 0;
                } else {
                    i = R.anim.a8;
                }
                baseActivity.overridePendingTransition(0, i);
            } else {
                activity.finish();
            }
        } else {
            Activity activity2 = this.LLILLJJLI.LL;
            if (activity2 != null && (resources = activity2.getResources()) != null) {
                string = resources.getString(2131845717);
            }
            C536080L0s c536080L0s2 = this.LLILLJJLI;
            if (c536080L0s2.LL != null && string != null) {
                Activity activity3 = c536080L0s2.LL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(string);
                C1390380mHk.LIZ(activity3, 4004, creativeToastBuilder);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoChosenResultFromAddSceneImpl@77d1.checkAddValid$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
