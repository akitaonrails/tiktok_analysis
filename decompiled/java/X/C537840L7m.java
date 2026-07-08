package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS38S0200100_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537840L7m {
    public final Activity LIZ;
    public final CutsameDataItem LIZIZ;
    public final ShortVideoContext LIZJ;

    public final Unit LIZ() {
        int size;
        String str;
        if (!this.LIZ.isFinishing()) {
            C2268941DrQ.LIZ.LIZIZ(AFwS210S0000000_22.get$arr$(372));
            C0LE8.LIZJ();
            CutsameDataItem cutsameDataItem = this.LIZIZ;
            if (cutsameDataItem != null) {
                C536810L3n.LIZ = new WeakReference<>(cutsameDataItem);
            }
            ShortVideoContext shortVideoContext = this.LIZJ;
            if (shortVideoContext != null) {
                C536810L3n.LIZIZ = new WeakReference<>(shortVideoContext);
            }
            String creationId = this.LIZJ.getCreationId();
            ShortVideoContext shortVideoContext2 = this.LIZJ;
            C536880L3u c536880L3u = new C536880L3u(creationId, shortVideoContext2.shootWay, this.LIZIZ.templateId);
            CreativeInfo creativeInfo = shortVideoContext2.creativeInfo;
            long jCurrentTimeMillis = System.currentTimeMillis();
            final AwS38S0200100_8 awS38S0200100_8 = new AwS38S0200100_8(jCurrentTimeMillis, this, c536880L3u, 1);
            C536870L3t c536870L3t = new C536870L3t(jCurrentTimeMillis, this, c536880L3u);
            final C0FQS c0fqs = new C0FQS();
            c0fqs.LIZIZ = new C0F1S(creativeInfo.getCreationId(), creativeInfo.getVersion(), creativeInfo.getSessionId());
            CutsameDataItem cutsameDataItem2 = this.LIZIZ;
            c0fqs.LJ = cutsameDataItem2.templateId;
            c0fqs.LJI = cutsameDataItem2.templateUrl;
            c0fqs.LJII = Integer.valueOf(cutsameDataItem2.templateType);
            CutsameDataItem cutsameDataItem3 = this.LIZIZ;
            c0fqs.LJFF = cutsameDataItem3;
            c0fqs.LIZJ = this.LIZJ.shootWay;
            c0fqs.LJIIL = (cutsameDataItem3.isMvAnchor == 1 ? C0L95.ANCHOR : C0L95.TEMPLATE_TAB).getValue();
            C1432940nOO.LIZ.getClass();
            c0fqs.LJIILIIL = C1432940nOO.LIZLLL();
            ArrayList<String> arrayList = this.LIZIZ.musicIds;
            String str2 = arrayList != null ? (String) C13LP.LJJJLL(arrayList) : null;
            CutsameDataItem cutsameDataItem4 = this.LIZIZ;
            String str3 = cutsameDataItem4.musicUrl;
            Boolean bool = cutsameDataItem4.musicPostUnavailable;
            c0fqs.LJIILL = new C537850L7n(bool, str2, str3);
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.CUT_SAME;
            c0fqs.LJIILJJIL = C0LCZ.LIZ(enumC1412640mre, bool, str2, str3);
            C537910L7t c537910L7t = C537910L7t.LIZ;
            String str4 = this.LIZJ.shootWay;
            c537910L7t.getClass();
            c0fqs.LJJ = new C1418100n0S(Intrinsics.LJFF(str4, "mv_page") ? "mv_anchor" : Intrinsics.LJFF(str4, "template_h5") ? "schema" : "mv_tab", c0fqs.LJ, enumC1412640mre);
            c0fqs.LJIJJLI.add(new InterfaceC537900L7s() { // from class: X.0L7q
                @Override // X.InterfaceC537900L7s
                public final void LIZ(String str5, C381330ExH c381330ExH) {
                }

                @Override // X.InterfaceC537900L7s
                public final void LIZIZ(String str5, C381350ExJ c381350ExJ) {
                }

                @Override // X.InterfaceC537900L7s
                public final void LIZJ(String str5) {
                }

                @Override // X.InterfaceC537900L7s
                public final void LIZLLL(String str5) {
                }

                @Override // X.InterfaceC537900L7s
                public final void LJ(C00DI c00di) {
                    if (c00di == C00DI.TEMPLATE_DOWNLOAD_PRE_SUCCESS) {
                        awS38S0200100_8.invoke();
                        c0fqs.LJIJJLI.remove(this);
                    }
                }
            });
            ITemplateService iTemplateService = (ITemplateService) PluggableExtentionKt.pluggableSpi$default(ITemplateService.class, false, false, false, 14, null);
            if (iTemplateService != null) {
                iTemplateService.LJJIFFI(c0fqs, new AwS587S0100000_8(this, 663), new AwS587S0100000_8(c536870L3t, 664));
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", this.LIZJ);
            bundle.putInt("key_choose_scene", 6);
            if (C297780Blo.LIZ()) {
                bundle.putBoolean("album_fluency_opt", false);
            }
            C786410Ut5.LJJIJL(bundle, "Key_cutsame_item", this.LIZIZ);
            bundle.putInt("is_mv_anchor", this.LIZIZ.isMvAnchor);
            ArrayList<String> arrayList2 = this.LIZIZ.challengeIds;
            if (arrayList2 != null && (str = (String) C13LP.LJJJLL(arrayList2)) != null) {
                C786410Ut5.LJJJI("Key_challenge_id", str, bundle);
            }
            int i = C0L8G.LIZ;
            ArrayList arrayListLIZ = C0L8G.LIZ(this.LIZIZ.extra);
            if (C0LE5.LIZ()) {
                size = C0LE5.LIZIZ();
                int size2 = arrayListLIZ.size();
                if (size > size2) {
                    size = size2;
                }
            } else {
                size = arrayListLIZ.size();
            }
            bundle.putInt("key_photo_select_min_count", size);
            bundle.putInt("key_video_select_min_count", size);
            C786410Ut5.LJJIL(bundle, "arg_data_process_items", arrayListLIZ);
            C786410Ut5.LJJJI("picker_mode", "MULTI", bundle);
            bundle.putInt("template_type", this.LIZIZ.templateType);
            C786410Ut5.LJJJI("mv_id", this.LIZIZ.templateId, bundle);
            String str5 = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LIZJ(this.LIZ, bundle, 10113, null);
        }
        return Unit.LIZ;
    }

    public C537840L7m(Activity activity, CutsameDataItem cutsameDataItem, ShortVideoContext shortVideoContext) {
        this.LIZ = activity;
        this.LIZIZ = cutsameDataItem;
        this.LIZJ = shortVideoContext;
    }
}
