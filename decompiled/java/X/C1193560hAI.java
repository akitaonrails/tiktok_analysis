package X;

import Y.ARunnableS26S0400000_18;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.poi.autoplay.AutoPlayController;
import com.ss.android.ugc.aweme.poi.autoplay.LifeCycleEnableStatus;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryReusedAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListReusedAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashBackToDetailProvider;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashVideoListPostsTriggerLineProvider;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailVideoListAutoPlayExp;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hAI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193560hAI extends AbstractC1181640gr4 implements InterfaceC1174010gel, InterfaceC1181380gqe {
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC665370Q7z LLILLL;
    public String LLILZ;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLILZIL = true;
    public boolean LLIZLLLIL = true;

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJFF(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJI(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJII(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJIIJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    public final void LJJIIJ() {
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner == null) {
            return;
        }
        String str = this.LLILZ;
        if (str != null) {
            PoiDetailVideoListAutoPlayExp.LIZ.getClass();
            if (!PoiDetailVideoListAutoPlayExp.LIZIZ(str)) {
                return;
            }
        }
        boolean z = !this.LLIZ || this.LLJI;
        if (this.LLILZLL && this.LLJ && z && this.LLILZIL) {
            this.LLILZIL = false;
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            C1203650hQZ c1203650hQZ = null;
            PoiSlashVideoListPostsTriggerLineProvider poiSlashVideoListPostsTriggerLineProvider = new PoiSlashVideoListPostsTriggerLineProvider(lifecycleOwner, interfaceC1181010gq3 != null ? interfaceC1181010gq3.Lt() : null, this.LLILLL);
            PoiSlashBackToDetailProvider poiSlashBackToDetailProvider = new PoiSlashBackToDetailProvider(lifecycleOwner.getLifecycle(), this.LLILLL);
            if (!this.LLIZ) {
                InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
                c1203650hQZ = new C1203650hQZ(interfaceC1181010gq32 != null ? interfaceC1181010gq32.Lt() : null, this.LLILLL);
            }
            C1193570hAJ c1193570hAJ = new C1193570hAJ(lifecycleOwner);
            C1193570hAJ.LIZ(c1193570hAJ, poiSlashVideoListPostsTriggerLineProvider);
            C1193570hAJ.LIZ(c1193570hAJ, c1203650hQZ);
            C1193570hAJ.LIZ(c1193570hAJ, poiSlashBackToDetailProvider);
            AutoPlayController autoPlayController = new AutoPlayController(lifecycleOwner);
            SparseArray sparseArray = (SparseArray) c1193570hAJ.LIZIZ.getValue();
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                InterfaceC1193590hAL interfaceC1193590hAL = (InterfaceC1193590hAL) sparseArray.valueAt(i);
                if (interfaceC1193590hAL != null) {
                    ((SparseArray) autoPlayController.LLILZLL.getValue()).put(iKeyAt, interfaceC1193590hAL);
                    interfaceC1193590hAL.LIZ((C588480N6g) autoPlayController.LLILLL.getValue());
                }
            }
            Iterator it2 = ((ArrayList) c1193570hAJ.LIZJ.getValue()).iterator();
            while (it2.hasNext()) {
                autoPlayController.LIZIZ((InterfaceC588530N6l) it2.next());
            }
            AutoPlayController.LIZ(autoPlayController.LL, autoPlayController);
            AutoPlayController.LIZ(autoPlayController.LL, (LifeCycleEnableStatus) autoPlayController.LLILZIL.getValue());
            autoPlayController.LIZIZ((AbstractC1193580hAK) autoPlayController.LLILZIL.getValue());
            C1203610hQV c1203610hQV = new C1203610hQV();
            ((C588480N6g) autoPlayController.LLILLL.getValue()).LIZJ = c1203610hQV;
            autoPlayController.LLILLJJLI = c1203610hQV;
            SparseArray sparseArray2 = (SparseArray) autoPlayController.LLILZLL.getValue();
            int size2 = sparseArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                sparseArray2.keyAt(i2);
                ((InterfaceC1193590hAL) sparseArray2.valueAt(i2)).init();
            }
        }
    }

    public C1193560hAI(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC665370Q7z;
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJ(InterfaceC1173990gej<?> interfaceC1173990gej, View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLt;
        PoiDetailVideoListAutoPlayExp poiDetailVideoListAutoPlayExp = PoiDetailVideoListAutoPlayExp.LIZ;
        String str = this.LLILZ;
        poiDetailVideoListAutoPlayExp.getClass();
        if (!PoiDetailVideoListAutoPlayExp.LIZIZ(str)) {
            return;
        }
        if (interfaceC1173990gej instanceof PoiVideoListReusedAssem) {
            this.LLJ = true;
        }
        if (interfaceC1173990gej instanceof PoiDiscoveryReusedAssem) {
            this.LLJI = true;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (viewOnAttachStateChangeListenerC20604515jvLt = interfaceC1181010gq3.Lt()) != null) {
            LJJIFFI(viewOnAttachStateChangeListenerC20604515jvLt, new AwS562S0100000_18(this, 2615));
        }
    }

    public final void LJJIFFI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Function0<Unit> function0) {
        IPoiPostsAutoPlayAbility iPoiPostsAutoPlayAbility;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHx1;
        C20600815jK<InterfaceC1891350zJl> state;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
        if (interfaceC665370Q7z != null && (iPoiPostsAutoPlayAbility = (IPoiPostsAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiPostsAutoPlayAbility.class, null)) != null && (viewOnAttachStateChangeListenerC20604515jvHx1 = iPoiPostsAutoPlayAbility.Hx1()) != null && (state = viewOnAttachStateChangeListenerC20604515jvHx1.getState()) != null && state.LJIIIIZZ() > 0) {
            if (!this.LLIZLLLIL) {
                return;
            }
            this.LLIZLLLIL = false;
            ViewTreeObserver viewTreeObserver = viewOnAttachStateChangeListenerC20604515jvHx1.getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1208850hYx viewTreeObserverOnGlobalLayoutListenerC1208850hYx = new ViewTreeObserverOnGlobalLayoutListenerC1208850hYx(viewOnAttachStateChangeListenerC20604515jvHx1, function0, 2);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1208850hYx);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1208850hYx, ViewTreeObserver.OnGlobalLayoutListener.class);
                return;
            }
            return;
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS26S0400000_18(viewOnAttachStateChangeListenerC20604515jv, viewOnAttachStateChangeListenerC20604515jv, this, function0, 2));
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLt;
        C1181190gqL c1181190gqL;
        List<C1180920gpu> listLIZ;
        String typeLevel;
        C1180920gpu c1180920gpu = null;
        if (this.LLILZ == null && c1180620gpQ != null && C1183670guL.LIZIZ(c1180620gpQ) != null) {
            PoiListApi.PoiDetailResponse poiDetailResponseLIZIZ = C1183670guL.LIZIZ(c1180620gpQ);
            if (poiDetailResponseLIZIZ != null) {
                typeLevel = poiDetailResponseLIZIZ.getTypeLevel();
            } else {
                typeLevel = null;
            }
            this.LLILZ = typeLevel;
        }
        String str2 = this.LLILZ;
        if (str2 != null) {
            PoiDetailVideoListAutoPlayExp.LIZ.getClass();
            if (!PoiDetailVideoListAutoPlayExp.LIZIZ(str2)) {
                return;
            }
        }
        boolean z2 = false;
        if (!this.LLIZ && z && c1180620gpQ != null && (c1181190gqL = c1180620gpQ.LL) != null && (listLIZ = c1181190gqL.LIZ()) != null) {
            Iterator<C1180920gpu> it2 = listLIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1180920gpu next = it2.next();
                if (next.LIZLLL instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponse) {
                    c1180920gpu = next;
                    break;
                }
            }
            C1180920gpu c1180920gpu2 = c1180920gpu;
            if (c1180920gpu2 != null) {
                this.LLIZ = C1180170goh.LIZ(c1180920gpu2, false);
            }
        }
        if (!this.LLILZLL) {
            if (c1180620gpQ != null) {
                z2 = c1180620gpQ.LLILLJJLI;
            }
            this.LLILZLL = z2;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (viewOnAttachStateChangeListenerC20604515jvLt = interfaceC1181010gq3.Lt()) != null) {
            LJJIFFI(viewOnAttachStateChangeListenerC20604515jvLt, new AwS562S0100000_18(this, 2616));
        }
    }
}
