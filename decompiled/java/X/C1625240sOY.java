package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dtk.r;
import java.util.ArrayList;
import java.util.List;
import jg5.AvS181S0000000_22;
import jg5.AvS182S0000000_25;
import jg5.AvS542S0100000_25;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AFwS332S0000000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import w1p.a;

/* JADX INFO: renamed from: X.0sOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625240sOY extends AbstractC1623220sLI {
    public static final /* synthetic */ int LLJLL = 0;
    public final C19GS LLJJI;
    public final String LLJJIII;
    public final C01GW<InterfaceC1635410sex> LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final InterfaceC1624480sNK LLJJIJIL;
    public final C1625270sOb LLJJJ;
    public final C1625420sOq LLJJJIL;
    public volatile boolean LLJJJJ;
    public Effect LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public FragmentManager LLJJL;
    public final C11NJ LLJJLIIIJLLLLLLLZ;
    public final C1449100noS LLJL;
    public final C1DRG LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    public final void LJFF() {
        this.LLJJIJIL.release();
        this.LLJJLIIIJLLLLLLLZ.LJ();
        if (this.LLJJIJI.isInitialized()) {
            this.LLJJIJI.getValue().ng();
        }
    }

    @Override // X.InterfaceC1623390sLZ
    public final InterfaceC1624480sNK C0() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1623220sLI
    public final C0LH1 vS0() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1623390sLZ
    public final InterfaceC1625410sOp w4() {
        return this.LLJJJIL;
    }

    public final void LJ(InterfaceC1456340o08<InterfaceC1625290sOd> interfaceC1456340o08) {
        LIZ(new UploadPicStickerARPresenter(this.LLJJI, null, new C21366718jZ(), new InterfaceC21361218ig() { // from class: X.0sOa
            @Override // X.InterfaceC21361218ig
            public final boolean LIZ(Effect effect) {
                return false;
            }

            @Override // X.InterfaceC21361218ig
            public final void LIZIZ() {
            }
        }, new InterfaceC537140L4u() { // from class: X.0L4m
            @Override // X.InterfaceC537140L4u
            public final List<C1621190sI1> LIZ(Intent intent) {
                ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                if (parcelableArrayListExtra != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
                    for (MediaModel mediaModel : parcelableArrayListExtra) {
                        arrayList.add(new C1621190sI1(0, mediaModel.LJFF(), null, null, mediaModel.duration, null, 60));
                    }
                    return arrayList;
                }
                return null;
            }

            @Override // X.InterfaceC537140L4u
            public final Bundle LIZIZ(C1624230sMv c1624230sMv) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_choose_scene", 3);
                bundle.putInt("key_photo_select_min_count", 1);
                bundle.putInt("key_photo_select_max_count", 1);
                bundle.putInt("upload_photo_min_height", 480);
                bundle.putInt("upload_photo_min_width", 360);
                bundle.putInt("key_support_flag", 1);
                return bundle;
            }
        }, null, null, AFwS311S0000000_25.get$arr$(28), false, null, null, null, null, new C1698400uIY(this, (C1625240sOY) interfaceC1456340o08, (InterfaceC1456340o08<InterfaceC1625290sOd>) 2), AFwS332S0000000_8.get$arr$(3), null, this.LLJJIJIL.getStickerRepository().LJFF().LJIJJ(), this.LLJJIJIL, new InterfaceC21362218iq() { // from class: X.0sOe
            @Override // X.InterfaceC21362218iq
            public final void LIZ() {
                InterfaceC1650230t2r interfaceC1650230t2r = (InterfaceC1650230t2r) this.LIZ.LLJJIJIIJIL.getValue();
                if (interfaceC1650230t2r != null) {
                    interfaceC1650230t2r.Al2(false, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_BACK_FROM_LIVE, EnumC2249681D3m.SHOOT));
                }
            }

            @Override // X.InterfaceC21362218iq
            public final void LIZIZ() {
                InterfaceC1650230t2r interfaceC1650230t2r = (InterfaceC1650230t2r) this.LIZ.LLJJIJIIJIL.getValue();
                if (interfaceC1650230t2r != null) {
                    interfaceC1650230t2r.sd0(false, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_ALBUM_OPEN, EnumC1641610sox.PAGE_INVISIBLE));
                }
            }
        }, null, null, null, null, null, C2348109Hz.LIZ(), C0CHQ.LIZ().LJIJJ().getCurrentScene(this.LLJJI), false, null, false, null, null, null, null, null, false, 2145418978, 1022), false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1625240sOY(final C19GS c19gs, String str) {
        final LifecycleOwner lifecycleOwnerLJIIIIZZ = C0CHQ.LIZ().LJIJJ().LJIIIIZZ(c19gs);
        super(lifecycleOwnerLJIIIIZZ, C0FWM.LIZ);
        this.LLJJI = c19gs;
        this.LLJJIII = str;
        C01GW<InterfaceC1635410sex> c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 487));
        this.LLJJIJI = c01gwLIZIZ;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 486));
        boolean z = false;
        InterfaceC1623440sLe interfaceC1623440sLe = null;
        Object[] objArr = 0;
        C1625320sOg c1625320sOg = new C1625320sOg(c19gs, new C1629320sV8("livestreaming", true, 0, null, null, false, false, false, false, false, null, null, null, 16777200), C1622260sJk.LIZ, c01gwLIZIZ.getValue(), C1625360sOk.LIZ(c19gs), lifecycleOwnerLJIIIIZZ, 32);
        c1625320sOg.LJII = new r();
        c1625320sOg.LJIIIIZZ = new C1420030n3Z();
        if (!C297880Bly.LIZ()) {
            a.LIZ();
        }
        final InterfaceC1624480sNK interfaceC1624480sNKCreate = c1625320sOg.create();
        this.LLJJIJIL = interfaceC1624480sNKCreate;
        this.LLJJJ = C1625270sOb.LIZ;
        C1625420sOq c1625420sOq = new C1625420sOq(interfaceC1624480sNKCreate, interfaceC1623440sLe, z, 62);
        this.LLJJJIL = c1625420sOq;
        new InterfaceC362610EJn() { // from class: X.0sOV
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                InterfaceC1623190sLF interfaceC1623190sLF;
                if (i != 4 || (interfaceC1623190sLF = this.LL.LLJI) == null || !interfaceC1623190sLF.isShowing()) {
                    return false;
                }
                InterfaceC1623190sLF interfaceC1623190sLF2 = this.LL.LLJI;
                if (interfaceC1623190sLF2 != null) {
                    interfaceC1623190sLF2.hide();
                }
                return true;
            }
        };
        this.LLJJJJ = true;
        this.LLJJLIIIJLLLLLLLZ = new C11NJ();
        final C1449100noS c1449100noS = new C1449100noS();
        this.LLJL = c1449100noS;
        C1DRF c1drf = new C1DRF();
        c1drf.LJFF(InterfaceC1628180sTI.class, null, new AvS182S0000000_25(14));
        c1drf.LJFF(InterfaceC1635660sfM.class, null, new AvS542S0100000_25(this, 43));
        c1drf.LJFF(InterfaceC1630220sWa.class, null, new AvS181S0000000_22(17));
        C1DRG c1drgLIZIZ = c1drf.LIZIZ();
        this.LLJLIL = c1drgLIZIZ;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(258));
        interfaceC1624480sNKCreate.getStickerRepository().LJII().LIZIZ(new C1623630sLx(new C1629070sUj(C452501pT.LIZIZ(new AwS569S0100000_25(this, 972)), objArr == true ? 1 : 0, 14), C786410Ut5.O3(c19gs), true));
        final InterfaceC1628180sTI interfaceC1628180sTI = (InterfaceC1628180sTI) c1drgLIZIZ.LJII(InterfaceC1628180sTI.class, null);
        final InterfaceC1630220sWa interfaceC1630220sWa = (InterfaceC1630220sWa) c1drgLIZIZ.LJII(InterfaceC1630220sWa.class, null);
        final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 485);
        LIZ(new C1623130sL9(c19gs, lifecycleOwnerLJIIIIZZ, interfaceC1624480sNKCreate, c1449100noS, interfaceC1628180sTI, interfaceC1630220sWa, awS569S0100000_25) { // from class: X.0sKm
            @Override // X.C1623130sL9, X.AbstractC1622390sJx
            public final boolean LJJI(C1627370sRz c1627370sRz) {
                Bundle bundle = c1627370sRz.LJ;
                if (bundle == null || !bundle.getBoolean("is_video_used_sticker")) {
                    return true;
                }
                return false;
            }
        }, false);
        c1625420sOq.LIZIZ(new InterfaceC1625190sOT() { // from class: X.0sOU
            @Override // X.InterfaceC1625190sOT
            public final <T> C1625490sOx LIZ(InterfaceC1625180sOS<T> interfaceC1625180sOS) {
                String str2;
                MutableLiveData mutableLiveDataAG;
                StickerTagChangeData stickerTagChangeData;
                String str3;
                MutableLiveData mutableLiveDataAG2;
                StickerTagChangeData stickerTagChangeData2;
                if (interfaceC1625180sOS instanceof C1625440sOs) {
                    C1625440sOs c1625440sOs = (C1625440sOs) interfaceC1625180sOS;
                    Effect effect = c1625440sOs.LIZ;
                    C1625240sOY c1625240sOY = this.LIZ;
                    C1449100noS c1449100noS2 = c1625240sOY.LLJL;
                    boolean zLJIIJ = C1625940sPg.LJIIJ(c1625240sOY.LLJJIJIL, effect);
                    InterfaceC1623190sLF interfaceC1623190sLF = this.LIZ.LLJI;
                    String str4 = "";
                    if (interfaceC1623190sLF == null || (mutableLiveDataAG2 = interfaceC1623190sLF.AG()) == null || (stickerTagChangeData2 = (StickerTagChangeData) mutableLiveDataAG2.getValue()) == null || (str2 = stickerTagChangeData2.tabName) == null) {
                        str2 = "";
                    }
                    InterfaceC1623190sLF interfaceC1623190sLF2 = this.LIZ.LLJI;
                    if (interfaceC1623190sLF2 != null && (mutableLiveDataAG = interfaceC1623190sLF2.AG()) != null && (stickerTagChangeData = (StickerTagChangeData) mutableLiveDataAG.getValue()) != null && (str3 = stickerTagChangeData.tabKey) != null) {
                        str4 = str3;
                    }
                    c1449100noS2.LJIIJ(effect, zLJIIJ, str2, str4, "click_main_panel", c1625440sOs.LIZIZ, false, null, null);
                }
                return new C1625490sOx();
            }
        });
        qf();
    }
}
