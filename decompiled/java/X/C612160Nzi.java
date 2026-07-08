package X;

import Y.AgS18S1400000_9;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM$handleFavoriteOptimsticUI$8", f = "VideoFavoriteVM.kt", l = {860}, m = "invokeSuspend")
public final class C612160Nzi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VideoFavoriteVM LLILLL;
    public final /* synthetic */ C09AE LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612160Nzi(VideoFavoriteVM videoFavoriteVM, C09AE c09ae, String str, InterfaceC1364105Vn<? super C612160Nzi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = videoFavoriteVM;
        this.LLILZ = c09ae;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C612160Nzi c612160Nzi = new C612160Nzi(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c612160Nzi.LLILLJJLI = obj;
        return c612160Nzi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoFavoriteVM@5c35.handleFavoriteOptimsticUI$8");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            VideoItemParams item = this.LLILLL.getItem();
            if (item != null) {
                VideoFavoriteVM videoFavoriteVM = this.LLILLL;
                C09AE c09ae = this.LLILZ;
                String str = this.LLILZIL;
                C0O9L c0o9l = C0O9L.LIZ;
                Aweme aweme = item.getAweme();
                String str2 = item.mEventType;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = item.mFrom;
                if (str4 != null) {
                    str3 = str4;
                }
                boolean zAQ2 = videoFavoriteVM.AQ2();
                long j = videoFavoriteVM.LL;
                c0o9l.getClass();
                C0O5I c0o5iK = ((InterfaceC612170Nzj) ((InterfaceC736910SvR) C0O9L.LIZLLL.getValue()).getOperator()).k(aweme, str2, str3, zAQ2, j);
                AgS18S1400000_9 agS18S1400000_9 = new AgS18S1400000_9(interfaceC497601wk, str, c09ae, videoFavoriteVM, item, 0);
                this.LL = 1;
                if (c0o5iK.collect(agS18S1400000_9, this) == objLJFF) {
                    C1C7U.LIZIZ("VideoFavoriteVM@5c35.handleFavoriteOptimsticUI$8");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoFavoriteVM@5c35.handleFavoriteOptimsticUI$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
