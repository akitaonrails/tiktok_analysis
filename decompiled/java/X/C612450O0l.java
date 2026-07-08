package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.UpdateFollowStatusOperator$invoke$1", f = "UpdateFollowStatusOperator.kt", l = {}, m = "invokeSuspend")
public final class C612450O0l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Aweme> LL;
    public final /* synthetic */ C612470O0n LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C612450O0l(List<? extends Aweme> list, C612470O0n c612470O0n, int i, InterfaceC1364105Vn<? super C612450O0l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c612470O0n;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612450O0l(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoBaseCell videoBaseCell;
        VideoBaseCell videoBaseCell2;
        C1C7U.LIZ("UpdateFollowStatusOperator@b494.invoke$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> list = this.LL;
        C612470O0n c612470O0n = this.LLILLJJLI;
        int i = this.LLILLL;
        for (Aweme aweme : list) {
            C0SZ8 c0sz8LJJIJIL = c612470O0n.LIZ.LJJIJIL(aweme.getAid());
            if (c0sz8LJJIJIL != null) {
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refresh sharer(");
                User sharer = AwemeBizExtKt.getSharer(aweme);
                String nickname = null;
                if (sharer != null) {
                    nickname = sharer.getNickname();
                }
                sbLIZ.append(nickname);
                sbLIZ.append("), toStatus:");
                sbLIZ.append(i);
                c2276471E8n.LIZIZ("recommend_feed", "@LinkRelation_Video", C2188811AlT.LIZIZ(sbLIZ));
                boolean z = c0sz8LJJIJIL instanceof VideoBaseCell;
                if (z && (((videoBaseCell = (VideoBaseCell) c0sz8LJJIJIL) != null && videoBaseCell.LLLIIL() == 2) || (z && (videoBaseCell2 = (VideoBaseCell) c0sz8LJJIJIL) != null && videoBaseCell2.LLLIIL() == 6))) {
                    VideoExposeSharerInformationVM videoExposeSharerInformationVMLIZJ = C0RLJ.LIZJ(c0sz8LJJIJIL);
                    if (videoExposeSharerInformationVMLIZJ != null) {
                        C612510O0r c612510O0r = VideoExposeSharerInformationVM.LLILZ;
                        videoExposeSharerInformationVMLIZJ.FQ2(0, R.attr.bx, false);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpdateFollowStatusOperator@b494.invoke$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
