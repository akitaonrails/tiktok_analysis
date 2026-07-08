package X;

import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AwS297S0300000_19;

/* JADX INFO: renamed from: X.0hl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216350hl3 extends AbstractC1216410hl9<C1255780ime, C1255920ims<C1255780ime>> implements InterfaceC1209700haK, InterfaceC1216440hlC {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public InterfaceC1053190dVt LLILZ;
    public Fragment LLILZIL;

    @Override // X.InterfaceC1216440hlC
    public final boolean aH0() {
        return C299890BpD.LIZ();
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        boolean z = (C299890BpD.LIZ() && this.mModel.hasMoreUp()) ? false : true;
        ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIIJJI(this.LLILZIL.getActivity(), !z);
        return z;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void unInit() {
        super.unInit();
        InterfaceC1053190dVt interfaceC1053190dVt = this.LLILZ;
        if (interfaceC1053190dVt != null) {
            interfaceC1053190dVt.je0(this.mModel);
        }
    }

    @Override // X.InterfaceC1209700haK
    public final void C3(List<? extends Aweme> list) {
        InterfaceC1053190dVt interfaceC1053190dVt = this.LLILZ;
        if (interfaceC1053190dVt != null) {
            interfaceC1053190dVt.C3(list);
        }
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        InterfaceC1053190dVt interfaceC1053190dVt;
        boolean zDeleteItem = super.deleteItem(str);
        if (zDeleteItem && (interfaceC1053190dVt = this.LLILZ) != null) {
            interfaceC1053190dVt.fn();
        }
        return zDeleteItem;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        int i2;
        if (this.LL) {
            i2 = LSPassThroughRecordSizeConfig.DEFAULT;
        } else {
            i2 = 2000;
        }
        return i2 + i;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        InterfaceC1053190dVt interfaceC1053190dVt = this.LLILZ;
        if (interfaceC1053190dVt != null) {
            interfaceC1053190dVt.jO2(this.mModel, this.LLILLL);
        }
        this.LLILZIL = fragment;
        return super.init(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0hl2] */
    @Override // X.InterfaceC1209700haK
    public final void LIZLLL(final C1603390rpJ c1603390rpJ, final AwS297S0300000_19 awS297S0300000_19) {
        this.LLILZ = CommerceProfileService.LIZLLL().LIZIZ(new InterfaceC1053120dVm() { // from class: X.0hl2
            @Override // X.InterfaceC1053120dVm
            public final AbstractC1255880imo<Aweme, ?> LIZ() {
                return this.LIZJ.mModel;
            }

            @Override // X.InterfaceC1053120dVm
            public final User LIZIZ() {
                return this.LIZJ.mModel.LLIZLLLIL;
            }

            @Override // X.InterfaceC1053120dVm
            public final boolean LIZJ() {
                return this.LIZJ.LL;
            }

            @Override // X.InterfaceC1053120dVm
            public final Aweme LJIIIIZZ() {
                return (Aweme) c1603390rpJ.invoke();
            }

            @Override // X.InterfaceC1053120dVm
            public final void LIZLLL(int i, Aweme aweme) {
                awS297S0300000_19.invoke(aweme, Integer.valueOf(i));
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
    public C1216350hl3(AbstractC1255880imo abstractC1255880imo, boolean z, String str, String str2) {
        this.mModel = abstractC1255880imo instanceof C1255780ime ? abstractC1255880imo : new C1255780ime();
        this.mPresenter = new C1255920ims();
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        boolean zLJI = MethodIDManager.LJI(137692);
        boolean zLIZ = C2105908Mv.LIZ(c2189821An6.getSecUid());
        int i3 = LSPassThroughRecordSizeConfig.DEFAULT;
        if (zLIZ) {
            if (C299890BpD.LIZ()) {
                PRESENTER presenter = this.mPresenter;
                Object[] objArr = new Object[7];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Boolean.TRUE;
                objArr[2] = this.LLILLJJLI;
                objArr[3] = Integer.valueOf(c2189821An6.getVideoType());
                if (!this.LL) {
                    i3 = 2000;
                }
                objArr[4] = Integer.valueOf(i3);
                objArr[5] = "";
                objArr[6] = "load_latest_detail_page_preload";
                presenter.LIZJ(objArr);
            } else {
                PRESENTER presenter2 = this.mPresenter;
                Object[] objArr2 = new Object[5];
                objArr2[0] = Integer.valueOf(i);
                objArr2[1] = Boolean.TRUE;
                objArr2[2] = this.LLILLJJLI;
                objArr2[3] = Integer.valueOf(c2189821An6.getVideoType());
                if (!this.LL) {
                    i3 = 2000;
                }
                objArr2[4] = Integer.valueOf(i3);
                presenter2.LIZJ(objArr2);
            }
        } else if (C299890BpD.LIZ()) {
            PRESENTER presenter3 = this.mPresenter;
            Object[] objArr3 = new Object[7];
            objArr3[0] = Integer.valueOf(i);
            objArr3[1] = Boolean.TRUE;
            objArr3[2] = this.LLILLJJLI;
            objArr3[3] = Integer.valueOf(c2189821An6.getVideoType());
            if (!this.LL) {
                i3 = 2000;
            }
            objArr3[4] = Integer.valueOf(i3);
            objArr3[5] = c2189821An6.getSecUid();
            objArr3[6] = "load_latest_detail_page_preload";
            presenter3.LIZJ(objArr3);
        } else {
            PRESENTER presenter4 = this.mPresenter;
            Object[] objArr4 = new Object[6];
            objArr4[0] = Integer.valueOf(i);
            objArr4[1] = Boolean.TRUE;
            objArr4[2] = this.LLILLJJLI;
            objArr4[3] = Integer.valueOf(c2189821An6.getVideoType());
            if (!this.LL) {
                i3 = 2000;
            }
            objArr4[4] = Integer.valueOf(i3);
            objArr4[5] = c2189821An6.getSecUid();
            presenter4.LIZJ(objArr4);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
