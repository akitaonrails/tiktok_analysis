package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.multiapp.IFeedExService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277711EDh implements IFeedExService {
    public static final C2277711EDh LIZIZ = new C2277711EDh();
    public final /* synthetic */ IFeedExService LIZ;

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LIZIZ(C0OB8 c0ob8) {
        return this.LIZ.LIZIZ(c0ob8);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJ(Aweme aweme) {
        return this.LIZ.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJI(Aweme aweme) {
        return this.LIZ.LJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final List<String> LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIIL(String str) {
        return this.LIZ.LJIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIILJJIL(Aweme aweme) {
        return this.LIZ.LJIILJJIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIILLIIL(C2189821An6 c2189821An6) {
        return this.LIZ.LJIILLIIL(c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJIIZILJ(Context context, C0RPZ c0rpz) {
        this.LIZ.LJIIZILJ(context, c0rpz);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJIJ(String str, String str2) {
        this.LIZ.LJIJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final Object LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJIJJ(Aweme aweme) {
        return this.LIZ.LJIJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final float LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final Drawable LJIL(int i, int i2, Context context) {
        return this.LIZ.LJIL(i, i2, context);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final String LJJ(Integer num, String str) {
        return this.LIZ.LJJ(num, str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final List<VideoTagCategoryProtocol> LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final Object LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJIII(String str) {
        return this.LIZ.LJJIII(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final <T> T LJJIIJ(T t) {
        return (T) this.LIZ.LJJIIJ(t);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJIIJZLJL(C2189821An6 c2189821An6, C2189871AnB c2189871AnB, String str) {
        this.LIZ.LJJIIJZLJL(c2189821An6, c2189871AnB, str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJIIZ(C19EG c19eg, Aweme aweme, DetailFragmentPanel detailFragmentPanel) {
        this.LIZ.LJJIIZ(c19eg, aweme, detailFragmentPanel);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final List<VideoTagCategoryProtocol> LJJIIZI() {
        return this.LIZ.LJJIIZI();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final Function0<C13IQ<? extends ReusedUISlotAssem<?>>> LJJIJ() {
        return this.LIZ.LJJIJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final C13IQ<? extends UIContentAssem> LJJIJIIJI(String str) {
        return this.LIZ.LJJIJIIJI(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final Set<String> LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJIJIL() {
        return this.LIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJIJL(String str) {
        return this.LIZ.LJJIJL(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJIJLIJ(Aweme aweme, C1590400rUM c1590400rUM) {
        this.LIZ.LJJIJLIJ(aweme, c1590400rUM);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJIL(C0OB8 c0ob8) {
        return this.LIZ.LJJIL(c0ob8);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final <T> T LJJIZ(T t, C2189821An6 c2189821An6) {
        return (T) this.LIZ.LJJIZ(t, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final String LJJJ(C737030Svd c737030Svd) {
        return this.LIZ.LJJJ(c737030Svd);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJJI(View view, C0OB8 c0ob8) {
        this.LIZ.LJJJI(view, c0ob8);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final String LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJJJ(boolean z) {
        return this.LIZ.LJJJJ(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJJJI(C2189821An6 c2189821An6, boolean z) {
        this.LIZ.LJJJJI(c2189821An6, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJJJIZL(View view) {
        this.LIZ.LJJJJIZL(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJJJJ() {
        return this.LIZ.LJJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJJJJL(C1386470mBR c1386470mBR, C2189821An6 c2189821An6) {
        this.LIZ.LJJJJJL(c1386470mBR, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJJJL(C737030Svd c737030Svd) {
        return this.LIZ.LJJJJL(c737030Svd);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final String LJJJJLI(Aweme aweme) {
        return this.LIZ.LJJJJLI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJJJLL(Music music) {
        return this.LIZ.LJJJJLL(music);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final C13IQ<? extends UIContentAssem> LJJJJZ(String str) {
        return this.LIZ.LJJJJZ(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJJJZI() {
        this.LIZ.LJJJJZI();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJJLIIL(boolean z) {
        return this.LIZ.LJJJLIIL(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJJLL(Aweme aweme) {
        return this.LIZ.LJJJLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final void LJJJLZIJ(AbstractC19511111Vd abstractC19511111Vd, ExtensionMisc extensionMisc) {
        this.LIZ.LJJJLZIJ(abstractC19511111Vd, extensionMisc);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final boolean LJJJZ() {
        return this.LIZ.LJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final Object fetchFeedList(C1601460rmC c1601460rmC) {
        return this.LIZ.fetchFeedList(c1601460rmC);
    }

    @Override // com.ss.android.ugc.aweme.feed.multiapp.IFeedExService
    public final C0CCZ getInitTask() {
        return this.LIZ.getInitTask();
    }

    public C2277711EDh() {
        IFeedExService iFeedExService = (IFeedExService) PluggableExtentionKt.pluggableSpi$default(IFeedExService.class, false, false, false, 14, null);
        if (iFeedExService != null) {
            this.LIZ = iFeedExService;
        } else {
            "no impl for IFeedExService".toString();
            throw new IllegalStateException("no impl for IFeedExService");
        }
    }
}
