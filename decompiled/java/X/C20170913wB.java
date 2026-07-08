package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13wB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.BaseCreateSocialStickerHandler$cancel$1", f = "BaseCreateSocialStickerHandler.kt", l = {384}, m = "invokeSuspend")
public final class C20170913wB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20171713wJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20170913wB(C20171713wJ c20171713wJ, InterfaceC1364105Vn<? super C20170913wB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20171713wJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20170913wB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BaseCreateSocialStickerHandler@12bc.cancel$1");
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
            C20170113w3 c20170113w3 = this.LLILLJJLI.LJIIJJI;
            this.LL = 1;
            C2296808zG.LIZJ(c20170113w3.LIZ, null);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("BaseCreateSocialStickerHandler@12bc.cancel$1");
                return objLJFF;
            }
        }
        for (SocialStickerResourceMetaData socialStickerResourceMetaData : this.LLILLJJLI.LJII.getStickerData().getResources()) {
            int type = socialStickerResourceMetaData.getType();
            boolean z2 = false;
            if (type != 2 && type != 5) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String localPath = socialStickerResourceMetaData.getLocalPath();
                if (localPath == null || localPath.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    try {
                        C2137908Zd.LIZJ.LIZLLL(localPath);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
        if (C0BWO.LIZ()) {
            AnonymousClass0522.LIZLLL(this.LLILLJJLI.LJII.getCreationId());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCreateSocialStickerHandler@12bc.cancel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
