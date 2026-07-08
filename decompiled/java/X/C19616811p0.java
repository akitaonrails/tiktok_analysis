package X;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11p0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19616811p0 extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C19616611oy LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19616811p0(String str, String str2, long j, C19616611oy c19616611oy) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = c19616611oy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        String aid;
        SparkContext sparkContext2 = sparkContext;
        sparkContext2.LJJJZ("event_id", this.LL);
        sparkContext2.LJJJZ("enter_from", this.LLILLJJLI);
        sparkContext2.LJJJZ("countdown_time", String.valueOf(C19615611oo.LIZIZ(this.LLILLL)));
        Aweme aweme = this.LLILZ.LLILLL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        sparkContext2.LJJJZ("group_id", aid);
        if (Intrinsics.LJFF(this.LLILLJJLI, "story")) {
            C1440005kM.LIZ(new C453940Hr6(true, false, 6));
            sparkContext2.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.06Mq
                @Override // X.InterfaceC1554220qY0
                public final void LIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJI(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJJ(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext3) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZI() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewAttachedToWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewDetachedFromWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                    C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                }
            });
        }
        return Unit.LIZ;
    }
}
