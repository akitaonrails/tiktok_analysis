package X;

import Y.AObjectS310S0200000_8;
import Y.AObjectS383S0100000_8;
import Y.ARunnableS15S0201000_8;
import Y.ARunnableS72S0200000_3;
import Y.AfS144S0200000_8;
import Y.AfS79S0101000_8;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS45S0100100_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Kq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529740Kq4 extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC530060Kqa, InterfaceC540750LIr, InterfaceC523480Kfy {
    public int LL = 12;
    public int LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public final Context LLILZLL;
    public final ContentResolver LLIZ;
    public final Set<String> LLIZLLLIL;
    public final ArrayList<TikTokMediaModel> LLJ;
    public Size LLJI;
    public final int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public InterfaceC529910KqL LLJILLL;
    public InterfaceC528410Knv LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final int LLJJIJIIJIL;
    public C530070Kqb LLJJIJIL;
    public final HashSet<String> LLJJJ;
    public boolean LLJJJIL;
    public List<String> LLJJJJ;
    public C530020KqW LLJJJJJIL;
    public Map<String, LivePhotoInfo> LLJJJJLIIL;
    public List<TikTokMediaModel> LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public RecyclerView LLJL;
    public List<TikTokMediaModel> LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public InterfaceC524480Kha LLJLLIL;
    public int LLJLLL;
    public C522190Kdt LLJZ;
    public boolean LLJZIJLIL;
    public final double LLL;
    public final int LLLF;
    public final int LLLFF;
    public final HashSet<RecyclerView.ViewHolder> LLLFFI;
    public final HashSet<C529750Kq5> LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public Runnable LLLIIIIL;
    public final C529850KqF LLLIIIL;
    public InterfaceC529880KqI LLLIIL;
    public final C529330KpP LLLIILIL;
    public List<InterfaceC529800KqA> LLLIL;
    public List<InterfaceC529800KqA> LLLILZ;
    public List<InterfaceC529800KqA> LLLILZJ;
    public InterfaceC529800KqA LLLILZLLLI;
    public int LLLIZZ;
    public final Map<Integer, Integer> LLLJ;
    public int LLLJIL;
    public int LLLJL;
    public final List<InterfaceC529920KqM> LLLL;
    public final LifecycleCoroutineScope LLLLII;
    public boolean LLLLIIIILLL;
    public final boolean LLLLIIL;
    public final boolean LLLLIILL;
    public C11JF LLLLIILLL;
    public C525190Kij LLLLIL;
    public boolean LLLLILI;
    public final Queue<String> LLLLJ;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.InterfaceC540750LIr
    public final void LJJJJL() {
        if (this.LLLII) {
            this.LLLII = false;
            Iterator<C529750Kq5> it2 = this.LLLFZ.iterator();
            while (it2.hasNext()) {
                C529750Kq5 next = it2.next();
                it2.remove();
                AbstractC1320710kTN abstractC1320710kTN = next.LLJLIL;
                if (abstractC1320710kTN != null) {
                    next.LL.setController(abstractC1320710kTN);
                }
            }
        }
    }

    @Override // X.InterfaceC540750LIr
    public final void LLJJIJI() {
        if (this.LLLII) {
            return;
        }
        this.LLLII = true;
    }

    public final boolean LLLIIIIL() {
        InterfaceC528410Knv interfaceC528410Knv;
        return this.LLJJIJIIJIL == 6 && (interfaceC528410Knv = this.LLJJ) != null && interfaceC528410Knv.LIZJ();
    }

    public final int LLLJ() {
        if (this.LLJILJIL == -1) {
            if (!((Boolean) C268000Aes.LIZ.getValue()).booleanValue() && !this.LLLLILI) {
                return Integer.MAX_VALUE;
            }
            this.LLJILJIL = Math.min(getItemCount() - 1, ((this.LLJL.getHeight() / this.LLJI.getHeight()) * this.LLJIJIL) - 1);
        }
        return this.LLJILJIL;
    }

    public final void LLLJL() {
        if (this.LLLIL == null) {
            this.LLLJIL = 0;
            return;
        }
        this.LLLILZ = new ArrayList();
        for (InterfaceC529800KqA interfaceC529800KqA : this.LLLIL) {
            if (interfaceC529800KqA.enable()) {
                this.LLLILZ.add(interfaceC529800KqA);
            }
        }
        this.LLLJIL = this.LLLILZ.size();
    }

    public final int LLLLIIIILLL() {
        return this.LLJZ.LJIIJ ? R.layout.csv : R.layout.csu;
    }

    public final void LLLLIIL() {
        int i = -1;
        for (TikTokMediaModel tikTokMediaModel : this.LLJLIL) {
            i++;
            Iterator<TikTokMediaModel> it2 = this.LLJ.iterator();
            while (it2.hasNext()) {
                if (tikTokMediaModel.LJFF().equals(it2.next().LJFF())) {
                    if (this.LLJJJ.isEmpty()) {
                        notifyItemChanged(this.LLLJIL + i, new Object());
                    } else {
                        notifyItemChanged(this.LLLJIL + i);
                    }
                }
            }
        }
    }

    public final void LLLLIL() {
        this.LLJI = C2372509Rj.LIZ(this.LLILZLL, this.LLJIJIL, this.LLLFF, this.LLLF, this.LLL);
        notifyDataSetChanged();
    }

    public final void LLLLJ() {
        C0WIY<Integer, Integer> c0wiyLIZ = C665750Q9l.LIZ(this.LLJL);
        int iIntValue = c0wiyLIZ.LIZ.intValue();
        notifyItemRangeChanged(iIntValue, (c0wiyLIZ.LIZIZ.intValue() - iIntValue) + 1, new Object());
        RecyclerView recyclerView = this.LLJL;
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mRecycler");
            declaredField.setAccessible(true);
            C21673319rv c21673319rv = (C21673319rv) declaredField.get(recyclerView);
            Field declaredField2 = C21673319rv.class.getDeclaredField("LIZ");
            declaredField2.setAccessible(true);
            List list = (List) declaredField2.get(c21673319rv);
            Field declaredField3 = C21673319rv.class.getDeclaredField("LIZJ");
            declaredField3.setAccessible(true);
            List list2 = (List) declaredField3.get(c21673319rv);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(list2);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int bindingAdapterPosition = ((RecyclerView.ViewHolder) it2.next()).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    notifyItemChanged(Integer.valueOf(bindingAdapterPosition).intValue(), new Object());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LLLLLIL() {
        Iterator<TikTokMediaModel> it2 = this.LLJ.iterator();
        while (it2.hasNext()) {
            it2.next().selectIndex = -1;
        }
        Iterator<TikTokMediaModel> it3 = this.LLJLIL.iterator();
        while (it3.hasNext()) {
            it3.next().selectIndex = -1;
        }
    }

    public final void LLLLZ() {
        this.LLIZLLLIL.clear();
        for (TikTokMediaModel tikTokMediaModel : this.LLJLIL) {
            if (tikTokMediaModel.LJIIJ() && this.LLLJL == 2) {
                this.LLIZLLLIL.add(((MediaModel) tikTokMediaModel).id);
            }
            if (tikTokMediaModel.LJIILJJIL() && this.LLLJL == 1) {
                this.LLIZLLLIL.add(((MediaModel) tikTokMediaModel).id);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0208 A[PHI: r4
      0x0208: PHI (r4v3 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel) = 
      (r4v2 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
      (r4v2 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
      (r4v2 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
      (r4v12 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
      (r4v16 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
     binds: [B:20:0x0058, B:21:0x005a, B:23:0x005e, B:124:0x0207, B:41:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[PHI: r4 r5
      0x009a: PHI (r4v11 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel) = 
      (r4v3 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
      (r4v5 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
      (r4v16 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel)
     binds: [B:125:0x0208, B:165:0x033c, B:42:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r5v4 char) = (r5v1 char), (r5v2 char), (r5v12 char) binds: [B:125:0x0208, B:165:0x033c, B:42:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZI() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529740Kq4.LLLLZI():void");
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJLIL.size() + this.LLLJIL + this.LLLIZZ;
    }

    public final void LLLLL() {
        LLLLLIL();
        if (!C0IKQ.LIZ(this.LLJ)) {
            this.LLJ.clear();
        }
        notifyDataSetChanged();
    }

    public static final String LLLILZLLLI(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        }
        return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)});
    }

    @Override // X.InterfaceC530060Kqa
    public final CharSequence LLFF(int i) {
        if (i >= 0 && i < this.LLJLIL.size()) {
            return C128U.LIZ(((MediaModel) ListProtector.get(this.LLJLIL, i)).date * 1000);
        }
        return "";
    }

    @Override // X.InterfaceC523480Kfy
    public final void LLJLL(TikTokMediaModel tikTokMediaModel) {
        String livePhotoPreviewMode;
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LivePhotoSync] applyLivePhotoState: mediaId=");
        sbLIZ.append(((MediaModel) tikTokMediaModel).id);
        sbLIZ.append(", mode=");
        LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
        if (livePhotoInfo != null) {
            livePhotoPreviewMode = livePhotoInfo.getLivePhotoPreviewMode();
        } else {
            livePhotoPreviewMode = "null";
        }
        sbLIZ.append(livePhotoPreviewMode);
        C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
        if (tikTokMediaModel.LJIIJJI() && tikTokMediaModel.livePhotoInfo != null) {
            C525050KiV.LIZIZ(tikTokMediaModel, this.LLJLIL);
            C525050KiV.LIZIZ(tikTokMediaModel, this.LLJ);
            String str = ((MediaModel) tikTokMediaModel).id;
            if (str != null) {
                for (int i = 0; i < this.LLJLIL.size(); i++) {
                    if (Objects.equals(((MediaModel) ListProtector.get(this.LLJLIL, i)).id, str)) {
                        if (i >= 0) {
                            notifyItemChanged(i + this.LLLJIL);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final boolean LLLL(C529750Kq5 c529750Kq5) {
        int i;
        boolean zLIZ = this.LLJJ.LIZ();
        if (this.LLJLILLLLZIIL == 26) {
            if (this.LLJJ.LJFF() || (c529750Kq5.LLJILLL.LJIILJJIL() && this.LLJJ.LJIIJJI())) {
                zLIZ = true;
            } else {
                zLIZ = false;
            }
        }
        if (this.LLJJIJIIJIL != 6 ? !zLIZ : !(zLIZ || LLLIIIIL())) {
            if (!((HashSet) this.LLIZLLLIL).contains(((MediaModel) c529750Kq5.LLJILLL).id)) {
                TikTokMediaModel tikTokMediaModel = c529750Kq5.LLJILLL;
                if (this.LLJLILLLLZIIL == 21 && tikTokMediaModel != null && tikTokMediaModel.LJIILJJIL() && (i = this.LLJLL) > 0 && tikTokMediaModel.duration >= i) {
                    return true;
                }
                if (this.LLJLLIL == null) {
                    return false;
                }
                return !r1.LIZIZ(c529750Kq5.LLJILLL);
            }
        }
        return true;
    }

    public final boolean LLLLII(TikTokMediaModel tikTokMediaModel) {
        boolean zLIZ = this.LLJJ.LIZ();
        if (this.LLJLILLLLZIIL == 26) {
            boolean zLJIIJJI = this.LLJJ.LJIIJJI();
            if (this.LLJJ.LJFF()) {
                this.LLILZ = C786410Ut5.j4(this.LLILZLL.getString(2131830079), new Object[]{Integer.valueOf(this.LLILLJJLI)});
            } else if (zLJIIJJI && tikTokMediaModel.LJIILJJIL()) {
                this.LLILZ = C786410Ut5.j4(this.LLILZLL.getString(2131833160), new Object[]{Integer.valueOf(this.LLILLL)});
            } else {
                return false;
            }
            return true;
        }
        return zLIZ;
    }

    public final void LLLLIILL(List<TikTokMediaModel> list) {
        if (!C529980KqS.LIZJ(this.LLJLILLLLZIIL) && C529980KqS.LIZLLL(this.LLJLILLLLZIIL)) {
            for (TikTokMediaModel tikTokMediaModel : list) {
                if (tikTokMediaModel.LJIILJJIL()) {
                    Iterator<TikTokMediaModel> it2 = this.LLJLIL.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            TikTokMediaModel next = it2.next();
                            if (tikTokMediaModel.LJIILJJIL() && Objects.equals(((MediaModel) tikTokMediaModel).id, ((MediaModel) next).id)) {
                                next.startTime = tikTokMediaModel.startTime;
                                next.endTime = tikTokMediaModel.endTime;
                                notifyItemChanged(i + this.LLLJIL);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        } else if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < this.LLJLIL.size(); i2++) {
                MediaModel mediaModel = (MediaModel) ListProtector.get(this.LLJLIL, i2);
                if (mediaModel.LJIIJJI()) {
                    map.put(mediaModel.id, Integer.valueOf(i2));
                }
            }
            HashMap map2 = new HashMap();
            for (TikTokMediaModel tikTokMediaModel2 : this.LLJ) {
                if (tikTokMediaModel2.LJIIJJI()) {
                    map2.put(((MediaModel) tikTokMediaModel2).id, tikTokMediaModel2);
                }
            }
            for (TikTokMediaModel tikTokMediaModel3 : list) {
                if (tikTokMediaModel3.LJIIJJI()) {
                    String str = ((MediaModel) tikTokMediaModel3).id;
                    Integer num = (Integer) map.get(str);
                    if (num != null) {
                        TikTokMediaModel tikTokMediaModel4 = (TikTokMediaModel) ListProtector.get(this.LLJLIL, num.intValue());
                        if (tikTokMediaModel4 != tikTokMediaModel3) {
                            C525050KiV.LIZ(tikTokMediaModel4, tikTokMediaModel3.livePhotoInfo);
                        }
                        notifyItemChanged(num.intValue() + this.LLLJIL);
                    }
                    TikTokMediaModel tikTokMediaModel5 = (TikTokMediaModel) map2.get(str);
                    if (tikTokMediaModel5 != null && tikTokMediaModel5 != tikTokMediaModel3) {
                        C525050KiV.LIZ(tikTokMediaModel5, tikTokMediaModel3.livePhotoInfo);
                    }
                }
            }
        }
    }

    public final void LLLLJI(InterfaceC529920KqM interfaceC529920KqM) {
        ((ArrayList) this.LLLL).add(interfaceC529920KqM);
    }

    public final void LLLLLJIL(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.LLJI.getWidth() && layoutParams.height != this.LLJI.getHeight()) {
            layoutParams.width = this.LLJI.getWidth();
            layoutParams.height = this.LLJI.getHeight();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0KpH] */
    public final void LLLLLL(C522190Kdt c522190Kdt) {
        this.LLJZ = c522190Kdt;
        C529330KpP c529330KpP = this.LLLIILIL;
        ((ArrayList) c529330KpP.LIZ).clear();
        ((ArrayList) c529330KpP.LIZIZ).clear();
        this.LLLIILIL.LIZ(new InterfaceC529320KpO<C529220KpE>() { // from class: X.0KpC
            @Override // X.InterfaceC529320KpO
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC529320KpO
            public final Object LIZJ(TikTokMediaModel tikTokMediaModel, C0L90 c0l90, C529340KpQ c529340KpQ) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c529340KpQ));
                C525490KjD.LIZ(tikTokMediaModel, false, new AwS45S0100100_8(c23260099m, jCurrentTimeMillis, 2));
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(c529340KpQ);
                }
                return objLIZ;
            }

            @Override // X.InterfaceC529320KpO
            public final void LIZ(InterfaceC529290KpL interfaceC529290KpL, Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                long j = ((C529220KpE) interfaceC529290KpL).LIZIZ;
                if (tikTokMediaModel.LJIILJJIL()) {
                    C528550Ko9.LIZ(tikTokMediaModel, false);
                }
                String strLIZ = C1918607fM.LIZ(tikTokMediaModel.fileName);
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                ChooseMediaExtensionKt.LIZIZ(new C529210KpD(-4, "MvImageChooseAdapter", jCurrentTimeMillis, strLIZ, "", false), tikTokMediaModel);
                C528550Ko9.LIZIZ(1, "MvImageChooseAdapter", jCurrentTimeMillis);
                if (!C523140KfQ.LIZ(c0l90)) {
                    if (tikTokMediaModel.LJIILJJIL()) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131835666);
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZJ(context, 3047, creativeToastBuilder);
                        return;
                    }
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(R.string.nfi);
                    creativeToastBuilder2.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(context, 3076, creativeToastBuilder2);
                }
            }
        });
        this.LLLIILIL.LIZ(new C529230KpF() { // from class: X.0Khi
            @Override // X.C529230KpF, X.InterfaceC529320KpO
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.C529230KpF
            public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                InterfaceC524480Kha interfaceC524480Kha = this.LIZ.LLJLLIL;
                if (interfaceC524480Kha != null && !interfaceC524480Kha.LIZIZ(tikTokMediaModel)) {
                    return true;
                }
                return false;
            }

            @Override // X.C529230KpF
            public final void LJ(Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                if (C523140KfQ.LIZ(c0l90)) {
                    return;
                }
                this.LIZ.LLJLLIL.LIZ(context, tikTokMediaModel);
            }
        });
        C529330KpP c529330KpP2 = this.LLLIILIL;
        final ?? r0 = new InterfaceC1631620sYq() { // from class: X.0KpH
            @Override // X.InterfaceC1631620sYq
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C529740Kq4 c529740Kq4 = this.LL;
                MediaModel mediaModel = (MediaModel) obj;
                C0L90 c0l90 = (C0L90) obj2;
                InterfaceC528930Kol interfaceC528930Kol = (InterfaceC528930Kol) obj3;
                int i = c529740Kq4.LLJJIJIIJIL;
                if (3 == i) {
                    if (mediaModel.LJIILJJIL()) {
                        c529740Kq4.LLLIILIL(mediaModel, c0l90, interfaceC528930Kol);
                    } else {
                        ChooseMediaExtensionKt.LIZIZ(null, mediaModel);
                        c529740Kq4.LLLII(mediaModel, interfaceC528930Kol);
                    }
                } else if (1 == i || 6 == i) {
                    c529740Kq4.LLLIILIL(mediaModel, c0l90, interfaceC528930Kol);
                } else {
                    ChooseMediaExtensionKt.LIZIZ(null, mediaModel);
                    c529740Kq4.LLLII(mediaModel, interfaceC528930Kol);
                }
                return Unit.LIZ;
            }
        };
        c529330KpP2.LIZ(new InterfaceC529320KpO(r0) { // from class: X.0KpI
            public final InterfaceC1631620sYq<TikTokMediaModel, C0L90, InterfaceC528930Kol, Unit> LIZ;

            @Override // X.InterfaceC529320KpO
            public final void LIZ(InterfaceC529290KpL interfaceC529290KpL, Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
            }

            @Override // X.InterfaceC529320KpO
            public final boolean LIZIZ() {
                return true;
            }

            {
                this.LIZ = r0;
            }

            @Override // X.InterfaceC529320KpO
            public final Object LIZJ(TikTokMediaModel tikTokMediaModel, C0L90 c0l90, C529340KpQ c529340KpQ) {
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c529340KpQ));
                this.LIZ.invoke(tikTokMediaModel, c0l90, new InterfaceC528930Kol() { // from class: X.0KpG
                    @Override // X.InterfaceC528930Kol
                    public final void LIZJ() {
                        InterfaceC1364105Vn<InterfaceC529270KpJ<? extends InterfaceC529290KpL>> interfaceC1364105Vn = c23260099m;
                        C529280KpK c529280KpK = InterfaceC529290KpL.LIZ;
                        C189200o6.m2constructorimpl(c529280KpK);
                        interfaceC1364105Vn.resumeWith(c529280KpK);
                    }

                    @Override // X.InterfaceC528930Kol
                    public final void onSuccess() {
                        InterfaceC1364105Vn<InterfaceC529270KpJ<? extends InterfaceC529290KpL>> interfaceC1364105Vn = c23260099m;
                        C529300KpM c529300KpM = C529300KpM.LIZIZ;
                        C189200o6.m2constructorimpl(c529300KpM);
                        interfaceC1364105Vn.resumeWith(c529300KpM);
                    }
                });
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(c529340KpQ);
                }
                return objLIZ;
            }
        });
        int i = this.LLJLILLLLZIIL;
        if (i == 19) {
            this.LLLIILIL.LIZ(new C529230KpF() { // from class: X.0Khh
                @Override // X.C529230KpF, X.InterfaceC529320KpO
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.C529230KpF
                public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    long j = tikTokMediaModel.duration;
                    if (j >= 1000 && j <= 1200000) {
                        return false;
                    }
                    return true;
                }

                @Override // X.C529230KpF
                public final void LJ(Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    int i2;
                    if (C523140KfQ.LIZ(c0l90)) {
                        return;
                    }
                    if (tikTokMediaModel.duration < 1000) {
                        i2 = 2131826424;
                    } else {
                        i2 = 2131826427;
                    }
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(i2);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(context, 3076, creativeToastBuilder);
                }
            });
        } else if (i == 26) {
            C529330KpP c529330KpP3 = this.LLLIILIL;
            final AObjectS383S0100000_8 aObjectS383S0100000_8 = new AObjectS383S0100000_8(this, 6);
            final AObjectS383S0100000_8 aObjectS383S0100000_82 = new AObjectS383S0100000_8(this, 7);
            c529330KpP3.LIZ(new InterfaceC529320KpO<InterfaceC529350KpR>(aObjectS383S0100000_8, aObjectS383S0100000_82) { // from class: X.0KpS
                public final Function0<Integer> LIZ;
                public final Function0<Integer> LIZIZ;

                @Override // X.InterfaceC529320KpO
                public final boolean LIZIZ() {
                    return true;
                }

                {
                    this.LIZ = aObjectS383S0100000_8;
                    this.LIZIZ = aObjectS383S0100000_82;
                }

                @Override // X.InterfaceC529320KpO
                public final Object LIZJ(TikTokMediaModel tikTokMediaModel, C0L90 c0l90, C529340KpQ c529340KpQ) {
                    if (tikTokMediaModel.LJIILJJIL()) {
                        int iIntValue = this.LIZ.invoke().intValue();
                        int iIntValue2 = this.LIZIZ.invoke().intValue();
                        long j = tikTokMediaModel.duration;
                        if (j < iIntValue) {
                            return new C529380KpU(iIntValue);
                        }
                        if (j > iIntValue2) {
                            return new C529370KpT(iIntValue2);
                        }
                    }
                    return C529300KpM.LIZIZ;
                }

                @Override // X.InterfaceC529320KpO
                public final void LIZ(InterfaceC529290KpL interfaceC529290KpL, Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    String string;
                    InterfaceC529350KpR interfaceC529350KpR = (InterfaceC529350KpR) interfaceC529290KpL;
                    if (!C523140KfQ.LIZ(c0l90)) {
                        if (interfaceC529350KpR instanceof C529380KpU) {
                            string = context.getString(2131833162, Integer.valueOf(((C529380KpU) interfaceC529350KpR).LIZIZ / LSPassThroughRecordSizeConfig.DEFAULT));
                        } else if (!(interfaceC529350KpR instanceof C529370KpT)) {
                            return;
                        } else {
                            string = context.getString(2131833161, Integer.valueOf(((C529370KpT) interfaceC529350KpR).LIZIZ / LSPassThroughRecordSizeConfig.DEFAULT));
                        }
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.message(string);
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZJ(context, 3047, creativeToastBuilder);
                    }
                }
            });
        }
        this.LLLIILIL.LIZ(new C529230KpF() { // from class: X.0KiM
            @Override // X.C529230KpF
            public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                return !this.LIZ.LLJJ.LJ();
            }
        });
        this.LLLIILIL.LIZ(new C529230KpF() { // from class: X.0KiN
            @Override // X.C529230KpF
            public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                if (!this.LIZ.LLLLII(tikTokMediaModel) && !this.LIZ.LLLIIIIL()) {
                    return false;
                }
                return true;
            }

            @Override // X.C529230KpF
            public final void LJ(Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                InterfaceC528410Knv interfaceC528410Knv;
                InterfaceC528410Knv interfaceC528410Knv2;
                if (tikTokMediaModel.LJIILJJIL()) {
                    C528550Ko9.LIZ(tikTokMediaModel, false);
                }
                if (C523140KfQ.LIZ(c0l90)) {
                    return;
                }
                C529740Kq4 c529740Kq4 = this.LIZ;
                String str = c529740Kq4.LLILZ;
                if (!c529740Kq4.LLLLII(tikTokMediaModel) && this.LIZ.LLLIIIIL()) {
                    str = this.LIZ.LLILZIL;
                }
                Context context2 = this.LIZ.LLILZLL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(str);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZJ(context2, 3075, creativeToastBuilder);
                if (C529980KqS.LIZJ(this.LIZ.LLJLILLLLZIIL) && (interfaceC528410Knv2 = this.LIZ.LLJJ) != null) {
                    interfaceC528410Knv2.LJIILIIL("content_limit");
                }
                C529740Kq4 c529740Kq42 = this.LIZ;
                if (c529740Kq42.LLJLILLLLZIIL == 64 && (interfaceC528410Knv = c529740Kq42.LLJJ) != null) {
                    interfaceC528410Knv.LJIILIIL("ame_select_limit");
                }
            }
        });
        if (this.LLJZ.LJFF.isUgcTemplate) {
            C529330KpP c529330KpP4 = this.LLLIILIL;
            final AObjectS383S0100000_8 aObjectS383S0100000_83 = new AObjectS383S0100000_8(this, 8);
            final AObjectS383S0100000_8 aObjectS383S0100000_84 = new AObjectS383S0100000_8(this, 9);
            c529330KpP4.LIZ(new C529230KpF(aObjectS383S0100000_83, aObjectS383S0100000_84) { // from class: X.0Khj
                public final Function0<Integer> LIZ;
                public final Function0<Unit> LIZIZ;

                @Override // X.C529230KpF, X.InterfaceC529320KpO
                public final boolean LIZIZ() {
                    return true;
                }

                {
                    this.LIZ = aObjectS383S0100000_83;
                    this.LIZIZ = aObjectS383S0100000_84;
                }

                @Override // X.C529230KpF
                public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    Integer numInvoke = this.LIZ.invoke();
                    if (numInvoke != null && numInvoke.intValue() == 2 && tikTokMediaModel.LJIIJ()) {
                        return true;
                    }
                    return false;
                }

                @Override // X.C529230KpF
                public final void LJ(Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    if (C523140KfQ.LIZ(c0l90)) {
                        return;
                    }
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131850070);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(context, 6014, creativeToastBuilder);
                    this.LIZIZ.invoke();
                }
            });
            C529330KpP c529330KpP5 = this.LLLIILIL;
            final AObjectS383S0100000_8 aObjectS383S0100000_85 = new AObjectS383S0100000_8(this, 10);
            final AObjectS383S0100000_8 aObjectS383S0100000_86 = new AObjectS383S0100000_8(this, 11);
            c529330KpP5.LIZ(new C529230KpF(aObjectS383S0100000_85, aObjectS383S0100000_86) { // from class: X.0Khk
                public final Function0<Integer> LIZ;
                public final Function0<Unit> LIZIZ;

                @Override // X.C529230KpF, X.InterfaceC529320KpO
                public final boolean LIZIZ() {
                    return true;
                }

                {
                    this.LIZ = aObjectS383S0100000_85;
                    this.LIZIZ = aObjectS383S0100000_86;
                }

                @Override // X.C529230KpF
                public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    Integer numInvoke = this.LIZ.invoke();
                    if (numInvoke != null && numInvoke.intValue() == 1 && tikTokMediaModel.LJIILJJIL()) {
                        return true;
                    }
                    return false;
                }

                @Override // X.C529230KpF
                public final void LJ(Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    if (C523140KfQ.LIZ(c0l90)) {
                        return;
                    }
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131850069);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(context, 6013, creativeToastBuilder);
                    this.LIZIZ.invoke();
                }
            });
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLJZ.LJFF;
        if (choosePhotoPreviewPageConfig.isCreatePUGCTemplateFrom || choosePhotoPreviewPageConfig.isUgcTemplate) {
            this.LLLIILIL.LIZ(new C529230KpF() { // from class: X.09OI
                @Override // X.C529230KpF, X.InterfaceC529320KpO
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.C529230KpF
                public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    if (tikTokMediaModel.LJIILJJIL()) {
                        C23203097h.LIZLLL(tikTokMediaModel.LJFF());
                        C23203097h.LJ(tikTokMediaModel.LJFF());
                        C23203097h.LIZJ(tikTokMediaModel.LJFF());
                        C23203097h.LJFF(tikTokMediaModel.LJFF(), true);
                        return false;
                    }
                    return false;
                }
            });
            this.LLLIILIL.LIZ(new C529230KpF() { // from class: X.0Khg
                @Override // X.C529230KpF, X.InterfaceC529320KpO
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.C529230KpF
                public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    boolean z = false;
                    try {
                        HashMap<String, String> metaData = TEVideoUtils.getMetaData(tikTokMediaModel.LJFF());
                        Iterator<T> it2 = metaData.keySet().iterator();
                        boolean z2 = false;
                        while (it2.hasNext()) {
                            try {
                                String str = metaData.get((String) it2.next());
                                String str2 = str;
                                if (str2 != null && a0.LJJIIZI(str2, "vicut", false) && Intrinsics.LJFF("vicut", new JSONObject(str).optString("source_type"))) {
                                    z2 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z = z2;
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                return z;
                            }
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return z2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }

                @Override // X.C529230KpF
                public final void LJ(Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                    if (C523140KfQ.LIZ(c0l90)) {
                        return;
                    }
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131829634);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(context, 6011, creativeToastBuilder);
                }
            });
        }
        C529330KpP c529330KpP6 = this.LLLIILIL;
        final Set<String> set = this.LLIZLLLIL;
        c529330KpP6.LIZ(new C529230KpF(set) { // from class: X.09OJ
            public final Set<String> LIZ;

            @Override // X.C529230KpF, X.InterfaceC529320KpO
            public final boolean LIZIZ() {
                return true;
            }

            {
                this.LIZ = set;
            }

            @Override // X.C529230KpF
            public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                return this.LIZ.contains(((MediaModel) tikTokMediaModel).id);
            }
        });
        C529330KpP c529330KpP7 = this.LLLIILIL;
        final AObjectS383S0100000_8 aObjectS383S0100000_87 = new AObjectS383S0100000_8(this, 12);
        c529330KpP7.LIZ(new C529230KpF(aObjectS383S0100000_87) { // from class: X.0Knx
            public final Function0<InterfaceC528410Knv> LIZ;

            {
                this.LIZ = aObjectS383S0100000_87;
            }

            @Override // X.C529230KpF
            public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                InterfaceC528410Knv interfaceC528410KnvInvoke = this.LIZ.invoke();
                if (interfaceC528410KnvInvoke == null) {
                    return false;
                }
                if (interfaceC528410KnvInvoke.LJII(tikTokMediaModel, c0l90) && interfaceC528410KnvInvoke.LJIILJJIL(tikTokMediaModel, c0l90)) {
                    return false;
                }
                return true;
            }
        });
        this.LLLIILIL.LIZ(new C529230KpF() { // from class: X.0Kj4
            @Override // X.C529230KpF
            public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
                tikTokMediaModel.selectionScenario = c0l90;
                return false;
            }
        });
    }

    public final void LLLLLLIL(boolean z) {
        LLLLLIL();
        this.LLJJI = z;
        if (!C0IKQ.LIZ(this.LLJ)) {
            this.LLJ.clear();
            InterfaceC528410Knv interfaceC528410Knv = this.LLJJ;
            if (interfaceC528410Knv != null) {
                interfaceC528410Knv.LJIIJ(this.LLJ, null, null);
            }
        }
        if (this.LLJL != null) {
            LLLLJ();
        } else {
            notifyDataSetChanged();
        }
    }

    public final void LLLLLLL(List<InterfaceC529800KqA> list) {
        if (list == null) {
            return;
        }
        this.LLLIL = list;
        LLLJL();
    }

    public final void LLLLLLLLL(List<String> list) {
        this.LLJJJ.addAll(list);
    }

    public final void LLLLLLLLLL(C525190Kij c525190Kij) {
        String str;
        this.LLLLIL = c525190Kij;
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LivePhotoSync] setLivePhotoSyncManager: manager=");
        if (c525190Kij != null) {
            str = "not null";
        } else {
            str = "null";
        }
        sbLIZ.append(str);
        C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
        if (c525190Kij != null) {
            c525190Kij.LIZIZ(this);
        }
    }

    public final void LLLLLLZ(List<TikTokMediaModel> list) {
        this.LLLLILI = true;
        LLLJL();
        C11NZ c11nzLJIJJLI = C11NZ.LJIJJLI(new C581220Mqu(this, list, 1));
        if (this.LLJLIL.size() != 0) {
            c11nzLJIJJLI = c11nzLJIJJLI.LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        c11nzLJIJJLI.LJJLJLI(new AfS144S0200000_8(this, list, 4));
    }

    public final void LLLLLLZZ(List<InterfaceC529800KqA> list) {
        if (list == null) {
            return;
        }
        this.LLLILZJ = list;
        this.LLLIZZ = list.size();
    }

    public final void LLLLLZ(List<TikTokMediaModel> list) {
        boolean z;
        Map<String, LivePhotoInfo> map;
        LivePhotoInfo livePhotoInfo;
        LivePhotoInfo livePhotoInfo2;
        if (list != null && !list.isEmpty()) {
            HashMap map2 = new HashMap();
            for (TikTokMediaModel tikTokMediaModel : this.LLJLIL) {
                if (tikTokMediaModel.LJIIJJI() && (livePhotoInfo2 = tikTokMediaModel.livePhotoInfo) != null && livePhotoInfo2.getHasUserClickedIcon()) {
                    map2.put(((MediaModel) tikTokMediaModel).id, livePhotoInfo2);
                }
            }
            HashMap map3 = new HashMap();
            for (TikTokMediaModel tikTokMediaModel2 : this.LLJ) {
                if (tikTokMediaModel2.LJIIJJI() && (livePhotoInfo = tikTokMediaModel2.livePhotoInfo) != null && livePhotoInfo.getHasUserClickedIcon()) {
                    map3.put(((MediaModel) tikTokMediaModel2).id, livePhotoInfo);
                }
            }
            for (TikTokMediaModel tikTokMediaModel3 : list) {
                String str = ((MediaModel) tikTokMediaModel3).id;
                Map<String, LivePhotoInfo> map4 = this.LLJJJJLIIL;
                if (map4 != null && map4.containsKey(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (tikTokMediaModel3.LJIIJJI() || z) {
                    LivePhotoInfo livePhotoInfo3 = (LivePhotoInfo) map2.get(str);
                    if (livePhotoInfo3 != null || (livePhotoInfo3 = (LivePhotoInfo) map3.get(str)) != null || ((map = this.LLJJJJLIIL) != null && (livePhotoInfo3 = map.get(str)) != null)) {
                        if (z && !tikTokMediaModel3.LJIIJJI()) {
                            tikTokMediaModel3.subType = 1;
                        }
                        C525050KiV.LIZ(tikTokMediaModel3, livePhotoInfo3);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        List<InterfaceC529800KqA> list;
        List<InterfaceC529800KqA> list2;
        if (i < this.LLLJIL && (list2 = this.LLLILZ) != null && !((ArrayList) list2).isEmpty()) {
            int iHashCode = ListProtector.get(this.LLLILZ, i).getClass().hashCode();
            ((HashMap) this.LLLJ).put(Integer.valueOf(iHashCode), Integer.valueOf(((InterfaceC529800KqA) ListProtector.get(this.LLLILZ, i)).layoutRes()));
            ((InterfaceC529800KqA) ListProtector.get(this.LLLILZ, i)).setAlbumActivity(C1388190mED.LIZ(this.LLILZLL));
            return iHashCode;
        }
        int size = this.LLLJIL + this.LLJLIL.size();
        if (i >= size && (list = this.LLLILZJ) != null && !list.isEmpty()) {
            int i2 = i - size;
            int iHashCode2 = ListProtector.get(this.LLLILZJ, i2).getClass().hashCode();
            ((HashMap) this.LLLJ).put(Integer.valueOf(iHashCode2), Integer.valueOf(((InterfaceC529800KqA) ListProtector.get(this.LLLILZJ, i2)).layoutRes()));
            ((InterfaceC529800KqA) ListProtector.get(this.LLLILZJ, i2)).setAlbumActivity(C1388190mED.LIZ(this.LLILZLL));
            return iHashCode2;
        }
        int i3 = i - this.LLLJIL;
        if (i3 >= 0 && i3 < this.LLJLIL.size() && ((TikTokMediaModel) ListProtector.get(this.LLJLIL, i3)).isLiveRecordingsGuide) {
            ((HashMap) this.LLLJ).put(1002, Integer.valueOf(R.layout.bfs));
            return 1002;
        }
        return 1001;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C11JF c11jf = this.LLLLIILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        TikTokMediaModel tikTokMediaModel;
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int i = bindingAdapterPosition - this.LLLJIL;
        if (i >= 0 && i < this.LLJLIL.size()) {
            tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LLJLIL, i);
        } else {
            tikTokMediaModel = null;
        }
        Iterator it2 = ((ArrayList) this.LLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC529920KqM) it2.next()).LIZ(bindingAdapterPosition, viewHolder.itemView, tikTokMediaModel);
        }
        if (!this.LLJILJILJ && bindingAdapterPosition >= LLLJ()) {
            this.LLJILJILJ = true;
            InterfaceC529800KqA interfaceC529800KqA = this.LLLILZLLLI;
            if (interfaceC529800KqA != null) {
                interfaceC529800KqA.onFirstScreenLoaded(LLLJ());
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C529750Kq5 c529750Kq5;
        InterfaceC420801kM interfaceC420801kM;
        this.LLLFFI.remove(viewHolder);
        if ((viewHolder instanceof C529750Kq5) && (interfaceC420801kM = (c529750Kq5 = (C529750Kq5) viewHolder).LLJLILLLLZIIL) != null && !interfaceC420801kM.isDisposed()) {
            c529750Kq5.LLJILJIL = "";
            c529750Kq5.LLJLILLLLZIIL = null;
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C433800Gzi c433800Gzi;
        Bitmap bitmap;
        if (InterfaceC540790LIv.LJI.getOpenAlbumOptiGroup() == 2) {
            this.LLLFZ.remove(viewHolder);
        }
        if (viewHolder instanceof C529750Kq5) {
            C529750Kq5 c529750Kq5 = (C529750Kq5) viewHolder;
            if (C23214097s.LIZ() && (c433800Gzi = c529750Kq5.LL) != null && (c433800Gzi.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) c529750Kq5.LL.getDrawable()).getBitmap()) != null) {
                c529750Kq5.LL.setImageBitmap(null);
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
        }
    }

    public final void setData(List<TikTokMediaModel> list) {
        this.LLLLILI = true;
        LLLJL();
        LLLLLZ(list);
        this.LLJLIL.clear();
        for (int i = 0; i < list.size(); i++) {
            ((TikTokMediaModel) ListProtector.get(list, i)).originIndex = i;
            this.LLJLIL.add((TikTokMediaModel) ListProtector.get(list, i));
        }
        list.isEmpty();
        LLLLZI();
        LLLLZ();
        notifyDataSetChanged();
    }

    public final void LLLFZ(final C529750Kq5 c529750Kq5, final int i) {
        boolean z;
        boolean z2;
        String str;
        TikTokMediaModel tikTokMediaModel = c529750Kq5.LLJILLL;
        if (tikTokMediaModel == null) {
            return;
        }
        if (TextUtils.isEmpty(tikTokMediaModel.mediaRatio)) {
            int i2 = tikTokMediaModel.width;
            int i3 = tikTokMediaModel.height;
            if (i2 > i3) {
                str = "horizontal";
            } else if (i2 < i3) {
                str = "vertical";
            } else {
                str = "square";
            }
            tikTokMediaModel.mediaRatio = str;
        }
        InterfaceC529900KqK interfaceC529900KqK = new InterfaceC529900KqK() { // from class: X.0Knk
            public long LIZ;

            @Override // X.InterfaceC529900KqK
            public final void onFailure(Throwable th) {
            }

            @Override // X.InterfaceC529900KqK
            public final void LIZ() {
                boolean z3;
                C529740Kq4 c529740Kq4 = this.LIZLLL;
                long j = this.LIZ;
                C529750Kq5 c529750Kq52 = c529750Kq5;
                int i4 = i;
                c529740Kq4.LLLFFI.add(c529750Kq52);
                boolean z4 = c529740Kq4.LLJZIJLIL && i4 == c529740Kq4.LLLJ();
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                int i5 = c529740Kq4.LLJJIJIIJIL;
                C523490Kfz c523490Kfz = C523490Kfz.LIZ;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                if (lValueOf.longValue() > 0) {
                    C523490Kfz.LIZIZ.add(Long.valueOf(lValueOf.longValue()));
                }
                if (C523490Kfz.LIZLLL == 0) {
                    C523490Kfz.LIZLLL = System.currentTimeMillis();
                }
                C523490Kfz c523490Kfz2 = C523490Kfz.LIZ;
                if (z4) {
                    if (c523490Kfz2 != null && !C523490Kfz.LIZJ && C523490Kfz.LJ != 0) {
                        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                        C0LAB c0lab = new C0LAB();
                        c0lab.LIZIZ(System.currentTimeMillis() - C523490Kfz.LJ, "duration");
                        c0lab.LIZIZ(C523490Kfz.LIZLLL - C523490Kfz.LJ, "time_to_first_image");
                        c0lab.LIZ(i5, "local_media_type");
                        if (C523490Kfz.LJFF) {
                            C523490Kfz.LJFF = false;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c0lab.LJFF("cold_start", z3);
                        c0lab.LIZ(i4, "size");
                        C2341909Fp.LIZ("tool_performance_loaded_thumbnail_time", c0lab.LIZ);
                        C523490Kfz.LIZJ = true;
                    }
                    if (z4) {
                        System.currentTimeMillis();
                        j jVar = C524780Ki4.LIZ;
                        jVar.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                        if (c529740Kq4.LLJZ.LJFF.isSoundSync) {
                            jVar.end("tool_performance_open_album_panel_sound_sync", "imageLoaded");
                        }
                        if (c529740Kq4.LLJZ.LJFF.isUgcTemplate) {
                            jVar.end("tool_performance_open_album_panel_ugc_template", "imageLoaded");
                        }
                        if (c529740Kq4.LLJZ.LJFF.isAutoCutAnchorMode) {
                            jVar.end("tool_performance_open_album_panel_autocut_anchor", "imageLoaded");
                        }
                        if (c529740Kq4.LLJZ.LJFF.LIZJ()) {
                            jVar.end("tool_performance_open_album_panel_photo_mode_template", "imageLoaded");
                        }
                        c529740Kq4.LLJZIJLIL = false;
                    }
                }
                if (c529740Kq4.LLLI) {
                    c529740Kq4.LLLI = false;
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LJ("type", "tool_performance_load_first_img_switching_tab");
                    c0lab2.LIZIZ(System.currentTimeMillis() - j, "totaltime");
                    C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab2.LIZ);
                }
            }

            @Override // X.InterfaceC529900KqK
            public final void LIZIZ() {
                this.LIZ = System.currentTimeMillis();
            }
        };
        InterfaceC529880KqI interfaceC529880KqI = this.LLLIIL;
        if (interfaceC529880KqI != null) {
            Size size = this.LLJI;
            C522300Ke4 c522300Ke4 = this.LLJZ.LJI;
            if (c522300Ke4.LIZ && c522300Ke4.LIZ() == C0L9A.NINE_TO_SIXTEEN) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC529880KqI.LIZ(c529750Kq5, size, tikTokMediaModel, interfaceC529900KqK, z2);
            return;
        }
        C529850KqF c529850KqF = this.LLLIIIL;
        Size size2 = this.LLJI;
        C522300Ke4 c522300Ke42 = this.LLJZ.LJI;
        if (c522300Ke42.LIZ && c522300Ke42.LIZ() == C0L9A.NINE_TO_SIXTEEN) {
            z = true;
        } else {
            z = false;
        }
        c529850KqF.LIZ(c529750Kq5, size2, tikTokMediaModel, interfaceC529900KqK, z);
    }

    public final void LLLI(C529750Kq5 c529750Kq5, TikTokMediaModel tikTokMediaModel) {
        Bitmap bitmap;
        if (c529750Kq5.LL.getDrawable() instanceof BitmapDrawable) {
            try {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(C2471909mP.LJIILIIL(tikTokMediaModel.LJFF()));
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(this.LLJI.getWidth(), this.LLJI.getHeight());
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                imageDecodeOptionsBuilder.getClass();
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
                C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                if (!C1322200kVm.LIZ().LJIIL(c1325710kbRLIZ) && (bitmap = ((BitmapDrawable) c529750Kq5.LL.getDrawable()).getBitmap()) != null && !bitmap.isRecycled()) {
                    C1328130kfL.LJIILIIL().LJII().LJ(C1324810kZz.LJI().LIZJ(c1325710kbRLIZ, null), C1323050kX9.LJIJJLI(new C1325120kaU(bitmap.copy(Bitmap.Config.RGB_565, true), C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0)));
                }
            } catch (OutOfMemoryError e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("album cache bitmap oom");
            }
        }
    }

    public final void LLLII(MediaModel mediaModel, InterfaceC528930Kol interfaceC528930Kol) {
        if (C297420BlE.LIZ()) {
            C23250099c.LIZLLL(this.LLLLII, null, null, new C2477709nL(this.LLIZ, mediaModel.LJFF(), null), 3);
        } else {
            C0CHQ.LIZ().LJIILL().updateMediaTypeCache(mediaModel.LJFF());
            C0CHQ.LIZ().LJIILL().cacheImageSize(mediaModel.LJFF());
        }
        C0CHQ.LIZ().LJIILL().cacheImageColor(mediaModel.LJFF(), this.LLJI.getWidth(), this.LLJZ.LJI.LIZIZ);
        interfaceC528930Kol.onSuccess();
    }

    public final void LLLIL(int i, boolean z) {
        this.LLLJL = i;
        if (z) {
            LLLLZ();
            LLLLJ();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0KqN] */
    public final void LLLILZ(C21341918fZ c21341918fZ, List<TikTokMediaModel> list) {
        final int i = this.LLLJIL;
        final ?? r2 = new InterfaceC529940KqO(i) { // from class: X.0KqN
            public final int LIZ;

            {
                this.LIZ = i;
            }

            @Override // X.InterfaceC529940KqO
            public final int LIZ(int i2) {
                return this.LIZ + i2;
            }
        };
        final RecyclerView recyclerView = this.LLJL;
        c21341918fZ.LIZIZ(new InterfaceC1891370zJn(this, recyclerView, r2) { // from class: X.0KqE
            public final AbstractC21673619ry<? extends RecyclerView.ViewHolder> LL;
            public final RecyclerView LLILLJJLI;
            public final InterfaceC529940KqO LLILLL;

            @Override // X.InterfaceC1891370zJn
            public final void LJZL(int i2, int i3) {
                int iLIZ = this.LLILLL.LIZ(i2);
                this.LL.notifyItemRangeInserted(iLIZ, i3);
                if (iLIZ == 0) {
                    this.LLILLJJLI.scrollToPosition(0);
                }
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLI(int i2, int i3) {
                this.LL.notifyItemMoved(this.LLILLL.LIZ(i2), this.LLILLL.LIZ(i3));
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLIZLLLIL(int i2, int i3) {
                this.LL.notifyItemRangeRemoved(this.LLILLL.LIZ(i2), i3);
            }

            {
                this.LL = this;
                this.LLILLJJLI = recyclerView;
                this.LLILLL = r2;
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLJJJJJIL(int i2, int i3, Object obj) {
                this.LL.notifyItemRangeChanged(this.LLILLL.LIZ(i2), i3, obj);
            }
        });
        LLLLLZ(list);
        this.LLJLIL = list;
        if (!this.LLJJJ.isEmpty() && this.LLJZ.LJFF.stickerMultiPhotosMode) {
            for (String str : new LinkedHashSet(this.LLJJJ)) {
                int i2 = 0;
                while (true) {
                    if (i2 < this.LLJLIL.size()) {
                        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LLJLIL, i2);
                        if (str.equals(tikTokMediaModel.LJFF())) {
                            LLLLLJLJLL(tikTokMediaModel, -1, C0L90.ALBUM);
                            this.LLJJJ.remove(tikTokMediaModel.LJFF());
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        LLLLZ();
        LLLLZI();
    }

    public final void LLLLILI(C529750Kq5 c529750Kq5, TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel.LJIILJJIL() && this.LLJJIJI) {
            int iRound = Math.round((((int) tikTokMediaModel.duration) * 1.0f) / 1000.0f);
            if (c529750Kq5.LLIZ == null) {
                View view = c529750Kq5.itemView;
                ARunnableS15S0201000_8 aRunnableS15S0201000_8 = new ARunnableS15S0201000_8(this, c529750Kq5, iRound, 2);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    aRunnableS15S0201000_8.run();
                    return;
                } else {
                    HandlerHook.viewPost(view, new ARunnableS72S0200000_3(view, aRunnableS15S0201000_8, 13));
                    return;
                }
            }
            TextView textView = c529750Kq5.LLIZ;
            ARunnableS15S0201000_8 aRunnableS15S0201000_82 = new ARunnableS15S0201000_8(this, c529750Kq5, iRound, 3);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                aRunnableS15S0201000_82.run();
            } else {
                HandlerHook.viewPost(textView, new ARunnableS72S0200000_3(textView, aRunnableS15S0201000_82, 13));
            }
        }
    }

    public final void LLLLLLLZIL(int i, int i2) {
        if (i != this.LLILLJJLI || this.LLILLL != i2) {
            LLLLJ();
        }
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LLLLIILLL((C529750Kq5) viewHolder, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fe  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r14, int r15) {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529740Kq4.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public final void LLLIILIL(final MediaModel mediaModel, C0L90 c0l90, final InterfaceC528930Kol interfaceC528930Kol) {
        boolean z;
        if (this.LLJJIJIL == null) {
            C530070Kqb c530070Kqb = new C530070Kqb(this.LLILZLL);
            this.LLJJIJIL = c530070Kqb;
            c530070Kqb.LIZLLL = "enter_from_multi";
        }
        C0CHQ.LIZ().isDebugConfigOpen();
        final boolean zLIZ = C523140KfQ.LIZ(c0l90);
        C530070Kqb c530070Kqb2 = this.LLJJIJIL;
        long j = this.LLJLL;
        if (this.LLJLILLLLZIIL != 0) {
            z = true;
        } else {
            z = false;
        }
        c530070Kqb2.LIZ(mediaModel, true, 1000L, j, z, false, zLIZ, new AObjectS310S0200000_8(interfaceC528930Kol, mediaModel, 3), new Function1() { // from class: X.0Koi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C529740Kq4 c529740Kq4 = this.LL;
                InterfaceC528930Kol interfaceC528930Kol2 = interfaceC528930Kol;
                MediaModel mediaModel2 = mediaModel;
                boolean z2 = zLIZ;
                C529210KpD c529210KpD = (C529210KpD) obj;
                c529740Kq4.getClass();
                interfaceC528930Kol2.LIZJ();
                if (!c529210KpD.LIZ) {
                    c529740Kq4.LLJJ.LJIIL();
                }
                ChooseMediaExtensionKt.LIZIZ(c529210KpD, mediaModel2);
                C528550Ko9.LIZIZ(1, c529210KpD.LIZIZ, c529210KpD.LIZJ);
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("errorCode", String.valueOf(c529210KpD.LJ));
                c543670LTx.LIZ.put("errorMsg", c529210KpD.LJFF);
                c543670LTx.LIZ.put("file_subfix", C2471909mP.LJIJJLI(mediaModel2.LJFF(), false));
                C1637890six.LJ("aweme_movie_import_error_rate", 1, c543670LTx.LJ());
                C526770KlH.LIZJ(c529210KpD.LJ, 0);
                if (!z2) {
                    C0CNO.LIZLLL(0L, new C528920Kok(c529740Kq4.LLILZLL, c529210KpD.LJ, LSPassThroughRecordSizeConfig.DEFAULT, c529740Kq4.LLJLL, c529210KpD));
                    if (c529740Kq4.LLJLILLLLZIIL == 21 && c529210KpD.LJ == -6) {
                        C912070ZqH.LIZIZ.LJFF().LIZJ();
                    }
                }
                C528550Ko9.LIZ(mediaModel2, false);
                return null;
            }
        });
    }

    public final void LLLJIL(final TikTokMediaModel tikTokMediaModel, final int i, final C0L90 c0l90) {
        if (tikTokMediaModel.selectIndex >= 0 && !this.LLJZ.LIZIZ) {
            if (this.LLLIIII && this.LLJ.size() <= 1) {
                Runnable runnable = this.LLLIIIIL;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            this.LLJJ.LJIIIZ(tikTokMediaModel);
            LLLLLZIL(tikTokMediaModel, i, c0l90);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MvImageChooseAdapter handleMediaSelected select originIndex ");
        sbLIZ.append(tikTokMediaModel.originIndex);
        sbLIZ.append(" selectIndex ");
        sbLIZ.append(tikTokMediaModel.selectIndex);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJIL = false;
        C23250099c.LIZLLL(this.LLLLII, null, null, new C1404605ee(this.LLLIILIL, this.LLILZLL, tikTokMediaModel, c0l90, new Function0() { // from class: X.0Kni
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C529740Kq4 c529740Kq4 = this.LL;
                TikTokMediaModel tikTokMediaModel2 = tikTokMediaModel;
                int i2 = i;
                C0L90 c0l902 = c0l90;
                c529740Kq4.LLLLLJLJLL(tikTokMediaModel2, i2, c0l902);
                InterfaceC528410Knv interfaceC528410Knv = c529740Kq4.LLJJ;
                if (interfaceC528410Knv != null) {
                    interfaceC528410Knv.LIZIZ(c0l902);
                }
                return Unit.LIZ;
            }
        }, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIILLL(final X.C529750Kq5 r18, final int r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 2043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529740Kq4.LLLLIILLL(X.0Kq5, int, boolean):void");
    }

    public final void LLLLLJLJLL(TikTokMediaModel tikTokMediaModel, int i, C0L90 c0l90) {
        C0L9I c0l9i;
        InterfaceC528410Knv interfaceC528410Knv;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MvImageChooseAdapter notifyMediaClick select originIndex ");
        sbLIZ.append(tikTokMediaModel.originIndex);
        sbLIZ.append(" selectIndex ");
        sbLIZ.append(tikTokMediaModel.selectIndex);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (c0l90 == C0L90.PREVIEW) {
            c0l9i = C0L9I.PREVIEW;
        } else if (c0l90 == C0L90.SELECTION_RESTORE) {
            c0l9i = null;
        } else {
            c0l9i = C0L9I.THUMBNAIL;
        }
        if (this.LLJ.size() == this.LL) {
            if (c0l90 != C0L90.SELECTION_RESTORE) {
                LLLLJ();
            }
            InterfaceC528410Knv interfaceC528410Knv2 = this.LLJJ;
            if (interfaceC528410Knv2 != null) {
                this.LLJJLIIIJLLLLLLLZ = interfaceC528410Knv2.LJI(true, tikTokMediaModel, c0l90);
                this.LLJJ.LJIIJ(this.LLJ, c0l9i, tikTokMediaModel);
                return;
            }
            return;
        }
        if (this.LLJ.contains(tikTokMediaModel) && !this.LLJZ.LIZIZ) {
            return;
        }
        if (this.LLJ.contains(tikTokMediaModel)) {
            tikTokMediaModel = tikTokMediaModel.LJIJ();
        }
        this.LLJ.add(tikTokMediaModel);
        List<String> list = this.LLJJJJ;
        if (list != null && !list.contains(((MediaModel) tikTokMediaModel).id)) {
            this.LLJJJJ.add(((MediaModel) tikTokMediaModel).id);
        }
        InterfaceC528410Knv interfaceC528410Knv3 = this.LLJJ;
        if (interfaceC528410Knv3 != null) {
            this.LLJJLIIIJLLLLLLLZ = interfaceC528410Knv3.LJI(true, tikTokMediaModel, c0l90);
            this.LLJJ.LJIIJ(this.LLJ, c0l9i, tikTokMediaModel);
        }
        tikTokMediaModel.selectIndex = this.LLJJLIIIJLLLLLLLZ;
        if (c0l90 != C0L90.SELECTION_RESTORE) {
            if (this.LLJ.size() != this.LL && (((interfaceC528410Knv = this.LLJJ) == null || !interfaceC528410Knv.LJIIJJI()) && !LLLIIIIL())) {
                if (i != -1 && i < this.LLJLIL.size() && TextUtils.equals(((MediaModel) ListProtector.get(this.LLJLIL, i)).LJFF(), tikTokMediaModel.LJFF())) {
                    notifyItemChanged(this.LLLJIL + i, new Object());
                } else {
                    LLLLIIL();
                }
            } else {
                LLLLJ();
            }
        }
        if (c0l90 == C0L90.AUTO_PICK_AGENT) {
            return;
        }
        int iIntValue = ((Number) C262910ASb.LIZ.getValue()).intValue();
        if (iIntValue == 1) {
            if (this.LLJLILLLLZIIL != 0) {
                return;
            }
        } else if (iIntValue != 2) {
            return;
        }
        C11JF c11jf = this.LLLLIILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLLLIILLL = (C11JF) C11NZ.LJLJJLL(50L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS79S0101000_8(this, i, 0));
    }

    public final void LLLLLZIL(TikTokMediaModel tikTokMediaModel, int i, C0L90 c0l90) {
        int i2 = tikTokMediaModel.selectIndex;
        tikTokMediaModel.selectIndex = -1;
        tikTokMediaModel.selectionScenario = null;
        int i3 = -1;
        for (int i4 = 0; i4 < this.LLJ.size(); i4++) {
            TikTokMediaModel tikTokMediaModel2 = (TikTokMediaModel) ListProtector.get(this.LLJ, i4);
            if (TextUtils.equals(tikTokMediaModel2.LJIILLIIL(), tikTokMediaModel.LJIILLIIL())) {
                i3 = i4;
            }
            int i5 = tikTokMediaModel2.selectIndex;
            if (i5 > i2) {
                tikTokMediaModel2.selectIndex = i5 - 1;
            }
        }
        if (i3 >= 0) {
            ListProtector.remove(this.LLJ, i3);
        }
        List<String> list = this.LLJJJJ;
        if (list != null) {
            list.remove(((MediaModel) tikTokMediaModel).id);
        }
        if (i != -1) {
            if (this.LLJ.size() + 1 == this.LL) {
                LLLLJ();
                notifyItemChanged(i, new Object());
            } else {
                if (i >= 0) {
                    notifyItemChanged(i, new Object());
                }
                Iterator<TikTokMediaModel> it2 = this.LLJ.iterator();
                while (it2.hasNext()) {
                    notifyItemChanged(it2.next().originIndex, new Object());
                }
            }
        } else {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("max_selected_image_count_fix", true) && this.LLJ.size() + 1 == this.LL) {
                LLLLJ();
            }
            notifyItemChanged(tikTokMediaModel.originIndex);
            LLLLIIL();
        }
        InterfaceC528410Knv interfaceC528410Knv = this.LLJJ;
        if (interfaceC528410Knv != null) {
            interfaceC528410Knv.LJI(false, tikTokMediaModel, c0l90);
            this.LLJJ.LJIIJ(this.LLJ, C0L9I.THUMBNAIL, tikTokMediaModel);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        LLLLIILLL((C529750Kq5) viewHolder, i, !list.isEmpty());
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.0KsW] */
    public C529740Kq4(LifecycleCoroutineScope lifecycleCoroutineScope, Context context, int i, double d, int i2, boolean z) {
        boolean z2;
        C533730KwV.LIZ.getClass();
        this.LLILLJJLI = C533730KwV.LJII();
        this.LLILLL = C533730KwV.LJII();
        this.LLIZLLLIL = new HashSet();
        this.LLJ = new ArrayList<>();
        this.LLJILJIL = -1;
        boolean z3 = false;
        this.LLJILJILJ = false;
        this.LLJJI = true;
        this.LLJJIII = false;
        this.LLJJJ = new LinkedHashSet();
        this.LLJJJIL = false;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = 1;
        this.LLJLIL = new ArrayList();
        this.LLJLILLLLZIIL = -1;
        this.LLJLL = -1;
        this.LLJLLIL = null;
        this.LLJLLL = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LLJZ = new C522190Kdt();
        this.LLLFFI = new HashSet<>(48);
        this.LLLFZ = new HashSet<>(48);
        this.LLLIIII = false;
        this.LLLIIIIL = null;
        this.LLLIILIL = new C529330KpP();
        this.LLLJ = new HashMap();
        this.LLLJL = -1;
        this.LLLL = new ArrayList();
        this.LLLLIIIILLL = false;
        this.LLLLILI = false;
        this.LLLLJ = new LinkedList();
        this.LLLLII = lifecycleCoroutineScope;
        this.LLILZLL = context;
        this.LLIZ = context.getContentResolver();
        this.LLJIJIL = i;
        this.LLJZIJLIL = z;
        this.LLL = d;
        this.LLLF = 0;
        context.getResources().getDimensionPixelOffset(R.dimen.a76);
        int iLIZJ = (int) C12ES.LIZJ(1.5f, context);
        this.LLLFF = iLIZJ;
        this.LLILZ = context.getString(2131828630);
        this.LLJJIJIIJIL = i2;
        if (EffectFullWidthHorizontalCarouselAB.isEnabled() && ((Boolean) C292910Bdx.LIZ.getValue()).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLLLIIL = z2;
        if (z2) {
            C578570Mmd.LIZ.getClass();
            if (C578570Mmd.LIZ()) {
                z3 = true;
            }
        }
        this.LLLLIILL = z3;
        this.LLJI = C2372509Rj.LIZ(context, i, iLIZJ, 0, d);
        this.LLLIIIL = new C529850KqF(new C530920Kry(context), new InterfaceC529880KqI() { // from class: X.0KsW
            public final boolean LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_enable_resized_image_diskcache", true, false);

            @Override // X.InterfaceC529880KqI
            public final void LIZ(C529750Kq5 c529750Kq5, Size size, TikTokMediaModel tikTokMediaModel, InterfaceC529900KqK interfaceC529900KqK, boolean z4) {
                EnumC1338240kve enumC1338240kve;
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(C2471909mP.LJIILIIL(tikTokMediaModel.LJFF()));
                c1331670kl3LJI.LJJ(c529750Kq5.LL);
                c1331670kl3LJI.LJIL = Bitmap.Config.RGB_565;
                if (C529990KqT.LIZ(tikTokMediaModel, z4)) {
                    enumC1338240kve = EnumC1338240kve.FIT_CENTER;
                } else {
                    enumC1338240kve = EnumC1338240kve.CENTER_CROP;
                }
                c1331670kl3LJI.LJJ = enumC1338240kve;
                c1331670kl3LJI.LJJIIZ(R.drawable.aku);
                int width = size.getWidth();
                int height = size.getHeight();
                c1331670kl3LJI.LJIIIIZZ = width;
                c1331670kl3LJI.LJIIIZ = height;
                c1331670kl3LJI.LJJIL = this.LIZ;
                c1331670kl3LJI.LJIILJJIL = 10;
                c1331670kl3LJI.LJIIJ(new C580720Mq6(interfaceC529900KqK, 0));
            }
        });
    }
}
