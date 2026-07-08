package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPaidContentFeedSeries;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SFC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFC implements IPaidContentFeedSeries {
    public static final C0SFC LIZIZ = new C0SFC();
    public final /* synthetic */ IPaidContentFeedSeries LIZ = (IPaidContentFeedSeries) ServiceManager.get().getService(IPaidContentFeedSeries.class);

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final void LIZ(C19EG c19eg, Context context, String str, Aweme aweme, String str2, Boolean bool, String str3, Function1<? super SmartRoute, Unit> function1) {
        this.LIZ.LIZ(c19eg, context, str, aweme, str2, bool, str3, function1);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C0SJF LIZIZ(C0SJF c0sjf, Context context, Aweme aweme) {
        return this.LIZ.LIZIZ(c0sjf, context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LIZJ(C718360SFu c718360SFu) {
        return this.LIZ.LIZJ(c718360SFu);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final ReusedAssem<? extends C03H5> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final void LJ(TuxTextView tuxTextView, List<String> list) {
        this.LIZ.LJ(tuxTextView, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C718840SHq LJFF(C718840SHq c718840SHq, Context context, Aweme aweme) {
        return this.LIZ.LJFF(c718840SHq, context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final ReusedAssem<? extends C03H5> LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIIIIZZ(Aweme aweme) {
        return this.LIZ.LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Function0<C13IQ<? extends ReusedUISlotAssem<?>>> LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ<? extends AbstractC738140SxQ> LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIIL(C718360SFu c718360SFu) {
        return this.LIZ.LJIIL(c718360SFu);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIILIIL(Fragment fragment) {
        return this.LIZ.LJIILIIL(fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIILLIIL(Aweme aweme) {
        return this.LIZ.LJIILLIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJIIZILJ(String str) {
        return this.LIZ.LJIIZILJ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJI(Object obj) {
        return this.LIZ.LJIJI(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJJ(Object obj) {
        return this.LIZ.LJIJJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJJLI(Object obj) {
        return this.LIZ.LJIJJLI(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIL(Aweme aweme) {
        return this.LIZ.LJIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ LJJ(C690870R8b c690870R8b) {
        return this.LIZ.LJJ(c690870R8b);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJJI() {
        return this.LIZ.LJJI();
    }
}
