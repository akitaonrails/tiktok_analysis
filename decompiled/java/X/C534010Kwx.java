package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$15", f = "CutOptimizedVideoChosenHandler.kt", l = {1327}, m = "invokeSuspend")
public final class C534010Kwx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0L7R LLILLL;
    public final /* synthetic */ Intent LLILZ;
    public final /* synthetic */ ArrayList<VideoSegment> LLILZIL;
    public final /* synthetic */ List<AVMusic> LLILZLL;
    public final /* synthetic */ List<ImportVideoInfo> LLIZ;
    public final /* synthetic */ Cut2EditTransferModel LLIZLLLIL;
    public final /* synthetic */ C013C LLJ;
    public final /* synthetic */ List<MediaModel> LLJI;
    public final /* synthetic */ C013C LLJIJIL;
    public final /* synthetic */ C013C LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;
    public final /* synthetic */ InterfaceC1631620sYq<Intent, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> LLJILLL;
    public final /* synthetic */ Function0<Unit> LLJJ;
    public final /* synthetic */ boolean LLJJI;
    public final /* synthetic */ Intent LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ MediaChooseResultListener LLJJIJIIJIL;
    public final /* synthetic */ boolean LLJJIJIL;
    public final /* synthetic */ C013C LLJJJ;
    public final /* synthetic */ int LLJJJIL;
    public final /* synthetic */ long LLJJJJ;
    public final /* synthetic */ long LLJJJJJIL;
    public final /* synthetic */ long LLJJJJLIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C534010Kwx(C0L7R c0l7r, Intent intent, ArrayList<VideoSegment> arrayList, List<? extends AVMusic> list, List<ImportVideoInfo> list2, Cut2EditTransferModel cut2EditTransferModel, C013C c013c, List<? extends MediaModel> list3, C013C c013c2, C013C c013c3, long j, InterfaceC1631620sYq<? super Intent, ? super Boolean, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> interfaceC1631620sYq, Function0<Unit> function0, boolean z, Intent intent2, String str, MediaChooseResultListener mediaChooseResultListener, boolean z2, C013C c013c4, int i, long j2, long j3, long j4, InterfaceC1364105Vn<? super C534010Kwx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0l7r;
        this.LLILZ = intent;
        this.LLILZIL = arrayList;
        this.LLILZLL = list;
        this.LLIZ = list2;
        this.LLIZLLLIL = cut2EditTransferModel;
        this.LLJ = c013c;
        this.LLJI = list3;
        this.LLJIJIL = c013c2;
        this.LLJILJIL = c013c3;
        this.LLJILJILJ = j;
        this.LLJILLL = interfaceC1631620sYq;
        this.LLJJ = function0;
        this.LLJJI = z;
        this.LLJJIII = intent2;
        this.LLJJIJI = str;
        this.LLJJIJIIJIL = mediaChooseResultListener;
        this.LLJJIJIL = z2;
        this.LLJJJ = c013c4;
        this.LLJJJIL = i;
        this.LLJJJJ = j2;
        this.LLJJJJJIL = j3;
        this.LLJJJJLIIL = j4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C534010Kwx c534010Kwx = new C534010Kwx(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, interfaceC1364105Vn);
        c534010Kwx.LLILLJJLI = obj;
        return c534010Kwx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList<ImportVideoInfo> arrayList;
        String stringExtra;
        boolean z;
        int i;
        Object objLJJJJL = obj;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$15");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJJJJL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJJJL);
            Object obj2 = this.LLILLJJLI;
            C0L7R c0l7r = this.LLILLL;
            Intent intent = this.LLILZ;
            ArrayList<VideoSegment> arrayList2 = this.LLILZIL;
            List<AVMusic> list = this.LLILZLL;
            if (this.LLIZ.isEmpty()) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(this.LLIZ);
            }
            Cut2EditTransferModel cut2EditTransferModel = this.LLIZLLLIL;
            boolean z2 = this.LLJ.element;
            List<MediaModel> list2 = this.LLJI;
            boolean z3 = this.LLJIJIL.element;
            boolean z4 = this.LLJILJIL.element;
            int i3 = (int) this.LLJILJILJ;
            InterfaceC1631620sYq<Intent, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> interfaceC1631620sYq = this.LLJILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            objLJJJJL = c0l7r.LJJJJL(intent, arrayList2, list, arrayList, cut2EditTransferModel, z2, list2, z3, z4, i3, interfaceC1631620sYq, this);
            if (objLJJJJL == objLJFF) {
                C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$15");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJJJJL).booleanValue();
        if (this.LLJILLL != null && !zBooleanValue) {
            this.LLJJ.invoke();
        } else {
            if (this.LLJJI) {
                C0L7R c0l7r2 = this.LLILLL;
                Intent intent2 = this.LLJJIII;
                String str = this.LLJJIJI;
                if (this.LLJJJJ > Math.max(this.LLJJJJJIL, this.LLJJJJLIIL)) {
                    i = 1;
                } else {
                    i = 2;
                }
                C0L7R.LJJIJIIJI(c0l7r2, intent2, str, 0, null, i, null, 44);
            }
            MediaChooseResultListener mediaChooseResultListener = this.LLJJIJIIJIL;
            if (mediaChooseResultListener != null) {
                mediaChooseResultListener.onMediaChooseSuccess();
            }
            C0L7R c0l7r3 = this.LLILLL;
            try {
                stringExtra = this.LLJJIII.getStringExtra("shoot_way");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            boolean z5 = this.LLJJIJIL;
            boolean z6 = this.LLJJJ.element;
            int i4 = this.LLJJJIL;
            if (i4 != 24 && i4 != 36) {
                z = false;
            } else {
                z = true;
            }
            C0L7R.LJJIL(c0l7r3, 1, stringExtra, false, z5, z6, z, false, 0, 64);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$15");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
