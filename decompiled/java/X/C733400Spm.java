package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Spm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$showShareGuideAnimation$1", f = "VideoShareViewModel.kt", l = {811, 825, 843}, m = "invokeSuspend")
public final class C733400Spm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ VideoShareViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733400Spm(Aweme aweme, VideoShareViewModel videoShareViewModel, InterfaceC1364105Vn<? super C733400Spm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = videoShareViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C733400Spm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C733650SqB c733650SqB = C733650SqB.LIZ;
            this.LL = 1;
            c733650SqB.getClass();
            obj = C733650SqB.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return objLJFF;
            }
        }
        C733490Spv c733490Spv = (C733490Spv) obj;
        if (c733490Spv == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
            return unit2;
        }
        EnumC733580Sq4 enumC733580Sq4 = c733490Spv.LIZ;
        if (enumC733580Sq4 == EnumC733580Sq4.EXTERNAL) {
            if (((Number) C0BPP.LIZ.getValue()).intValue() == 2) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit3;
            }
            C1004140cEm.LIZ.getClass();
            if (C1004140cEm.LIZIZ()) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit4;
            }
            IInternalShareApi.LIZ.getClass();
            if (C1370970lmR.LIZ().LIZIZ().LJJII(this.LLILLJJLI)) {
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit5;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C732760Sok c732760Sok = new C732760Sok(this.LLILLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c732760Sok) == objLJFF) {
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return objLJFF;
            }
        } else if (enumC733580Sq4 == EnumC733580Sq4.CONTACT) {
            if (((Number) C0BPP.LIZ.getValue()).intValue() == 1) {
                Unit unit6 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit6;
            }
            C1004140cEm.LIZ.getClass();
            if (C1004140cEm.LIZ().reverseInternalShare == 1) {
                Unit unit7 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit7;
            }
            IInternalShareApi.LIZ.getClass();
            if (C1370970lmR.LIZ().LIZIZ().LJJII(this.LLILLJJLI)) {
                Unit unit8 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit8;
            }
            UrlModel urlModel = c733490Spv.LIZIZ;
            if (urlModel == null) {
                Unit unit9 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit9;
            }
            String str = c733490Spv.LIZJ;
            if (str == null) {
                Unit unit10 = Unit.LIZ;
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return unit10;
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C732750Soj c732750Soj = new C732750Soj(this.LLILLL, urlModel, str, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq2, c732750Soj) == objLJFF) {
                C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
                return objLJFF;
            }
        }
        Unit unit11 = Unit.LIZ;
        C1C7U.LIZIZ("VideoShareViewModel@3d60.showShareGuideAnimation$1");
        return unit11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
