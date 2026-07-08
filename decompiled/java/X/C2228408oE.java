package X;

import android.media.MediaPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08oE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePlayManager$startProgressPolling$1", f = "BulletinVoicePlayManager.kt", l = {520}, m = "invokeSuspend")
public final class C2228408oE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C621370OYt LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2228408oE(C621370OYt c621370OYt, String str, InterfaceC1364105Vn<? super C2228408oE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c621370OYt;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2228408oE c2228408oE = new C2228408oE(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2228408oE.LLILLJJLI = obj;
        return c2228408oE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C621370OYt c621370OYt;
        MediaPlayer mediaPlayer;
        C1C7U.LIZ("BulletinVoicePlayManager@82ba.startProgressPolling$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk) && (mediaPlayer = (c621370OYt = this.LLILLL).LJII) != null && Intrinsics.LJFF(c621370OYt.LJIIIIZZ, this.LLILZ)) {
            try {
                this.LLILLL.LJFF(this.LLILZ).setValue(new C2227808o8(mediaPlayer.getCurrentPosition(), mediaPlayer.getDuration()));
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(33L, this) == objLJFF) {
                    C1C7U.LIZIZ("BulletinVoicePlayManager@82ba.startProgressPolling$1");
                    return objLJFF;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoicePlayManager@82ba.startProgressPolling$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
