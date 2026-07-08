package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.ur.socialavatar.SocialAvatarStoryUtils$downloadAnimationFile$2", f = "SocialAvatarStoryUtils.kt", l = {106}, m = "invokeSuspend")
public final class C365101bN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public C0VSJ LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C365101bN(String str, String str2, InterfaceC1364105Vn<? super C365101bN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C365101bN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return invoke2(interfaceC497601wk, (InterfaceC1364105Vn<Object>) interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        C0VSJ c0vsj;
        C1C7U.LIZ("SocialAvatarStoryUtils@8e2e.downloadAnimationFile$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c0vsj = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C2388309Xl c2388309Xl = C2388309Xl.LIZ;
                String str = this.LLILZ;
                c2388309Xl.getClass();
                c0vsj = new C0VSJ(str, "downloaded_gif.gif");
                String str2 = this.LLILLL;
                this.LL = c0vsj;
                this.LLILLJJLI = 1;
                if (C2388309Xl.LIZ(c2388309Xl, str2, c0vsj, this) == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarStoryUtils@8e2e.downloadAnimationFile$2");
                    return objLJFF;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloaded ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" to ");
            sbLIZ.append(c0vsj.getAbsolutePath());
            objLJ = C2286608xc.LJ(Log.d("SocialAvatarStoryUtils", C2188811AlT.LIZIZ(sbLIZ)));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            objLJ = Unit.LIZ;
        }
        C1C7U.LIZIZ("SocialAvatarStoryUtils@8e2e.downloadAnimationFile$2");
        return objLJ;
    }
}
