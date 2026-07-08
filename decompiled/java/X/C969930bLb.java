package X;

import Y.AcS496S0100000_15;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS2S2200100_15;
import kotlin.jvm.internal.AwS52S0000100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS69S0100100_15;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: renamed from: X.0bLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969930bLb extends AbstractC970120bLu {
    public final Context LLILZIL;
    public final DataChannel LLILZLL;
    public final EnumC952890au7 LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final Function1<Boolean, Unit> LLJ;
    public final Function1<Integer, Unit> LLJI;
    public long LLJILJIL;
    public final HashSet<Long> LLJIJIL = new HashSet<>();
    public final C970070bLp LLJILJILJ = new InterfaceC952880au6() { // from class: X.0bLp
        @Override // X.InterfaceC952880au6
        public final void onSuccess() {
            this.LIZ.LLLILZ();
        }

        @Override // X.InterfaceC952880au6
        public final void LIZ(Throwable th) {
            this.LIZ.LLLILZ();
        }
    };
    public final C970020bLk LLJILLL = new InterfaceC952790atx() { // from class: X.0bLk
        @Override // X.InterfaceC952790atx
        public final void LJ() {
            this.LIZ.LLLILZ();
            if (!this.LIZ.LL.isEmpty()) {
                this.LIZ.LLJI.invoke(0);
            }
        }
    };
    public final C970100bLs LLJJ = new InterfaceC952920auA() { // from class: X.0bLs
        @Override // X.InterfaceC952920auA
        public final void LIZJ() {
            this.LIZ.LLLILZ();
        }
    };
    public final C970110bLt LLJJI = new InterfaceC953310aun() { // from class: X.0bLt
        @Override // X.InterfaceC953310aun
        public final void LIZIZ() {
            this.LIZ.LLLILZ();
        }
    };
    public final C969970bLf LLJJIII = new InterfaceC915550Zvt() { // from class: X.0bLf
        @Override // X.InterfaceC915550Zvt
        public final void LIZ(Throwable th) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("editTemplate, download fail, throwable: ");
            sbLIZ.append(th);
            C20441214yg.LJIIIZ("TemplateDialog", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC915550Zvt
        public final void LIZIZ(C953770avX c953770avX) throws Throwable {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("editTemplate, download success, templateId = ");
            sbLIZ.append(c953770avX.LJIIL);
            C20441214yg.LJIIIZ("TemplateDialog", C2188811AlT.LIZIZ(sbLIZ));
            C969930bLb c969930bLb = this.LIZ;
            DialogC971210bNf dialogC971210bNf = new DialogC971210bNf(c969930bLb.LLILZIL, c969930bLb.LLILZLL, c953770avX, new AwS559S0100000_15(c969930bLb, 54));
            C969930bLb c969930bLb2 = this.LIZ;
            c969930bLb2.LLJ.invoke(Boolean.FALSE);
            dialogC971210bNf.show();
            C785410UrT.LIZIZ(dialogC971210bNf);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC971210bNf);
            C816490W1f.LIZ(dialogC971210bNf);
            dialogC971210bNf.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(c969930bLb2, 1));
        }
    };
    public final C970040bLm LLJJIJI = new C970040bLm(this);
    public final C969950bLd LLJJIJIIJIL = new InterfaceC953490av5() { // from class: X.0bLd
        @Override // X.InterfaceC953490av5
        public final void LIZ(long j) {
            AwS69S0100100_15 awS69S0100100_15 = new AwS69S0100100_15(j, this.LIZ, 4);
            C953230auf.LIZ.getClass();
            if (C953230auf.LIZIZ.size() >= C953230auf.LIZLLL) {
                C953230auf.LJIJ(this.LIZ.LLILZIL, new AwS559S0100000_15(awS69S0100100_15, 353), AFwS203S0000000_15.get$arr$(114));
            } else {
                awS69S0100100_15.invoke();
            }
        }

        @Override // X.InterfaceC953490av5
        public final void LJFF(long j) {
            C953230auf c953230auf = C953230auf.LIZ;
            C970100bLs c970100bLs = this.LIZ.LLJJ;
            c953230auf.getClass();
            C953230auf.LIZJ(j, c970100bLs);
        }

        @Override // X.InterfaceC953490av5
        public final void LJI(long j) {
            C953230auf c953230auf = C953230auf.LIZ;
            C970100bLs c970100bLs = this.LIZ.LLJJ;
            c953230auf.getClass();
            C953230auf.LIZJ(j, c970100bLs);
        }

        @Override // X.InterfaceC953490av5
        public final void LIZJ(int i, String str) {
            C970040bLm c970040bLm = this.LIZ.LLJJIJI;
            c970040bLm.LIZ = i;
            C953230auf.LIZ.getClass();
            C953230auf.LIZ(str, c970040bLm);
        }

        @Override // X.InterfaceC953490av5
        public final void LIZLLL(int i, long j, String str) {
            C953230auf c953230auf = C953230auf.LIZ;
            C970110bLt c970110bLt = this.LIZ.LLJJI;
            c953230auf.getClass();
            C953230auf.LJIJI(str, j, i, c970110bLt);
        }

        @Override // X.InterfaceC953490av5
        public final void LJ(long j, String str, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
            BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
            C176600m4.LIZJ(new AwS52S0000100_15(this.LIZ.LLJILJIL, 0));
            CloudDraftItemManager.LJFF(j, this.LIZ.LLJJIII, str, null, convertNoticeboardMaterialInfo);
            this.LIZ.LLJILJIL = j;
        }

        @Override // X.InterfaceC953490av5
        public final void LIZIZ(long j, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
            C969930bLb c969930bLb;
            EnumC952890au7 enumC952890au7;
            AwS2S2200100_15 awS2S2200100_15 = new AwS2S2200100_15(this.LIZ, j, str2, str, convertNoticeboardMaterialInfo, 0);
            C953610avH.LJJI.getClass();
            if (C953610avH.LJJIIJ != null && (enumC952890au7 = (c969930bLb = this.LIZ).LLIZ) != EnumC952890au7.PREVIEW_SETTING && enumC952890au7 != EnumC952890au7.PREVIEW_BOARD_ICON && enumC952890au7 != EnumC952890au7.PREVIEW_PLAYBOOK && enumC952890au7 != EnumC952890au7.PREVIEW_TOOLBAR_PLAYBOOK && enumC952890au7 != EnumC952890au7.PLAYBOOK_EDIT) {
                C782110Um9 c782110Um9 = new C782110Um9(c969930bLb.LLILZIL);
                c782110Um9.LJIIZILJ(2131854957);
                c782110Um9.LJII(2131854956);
                c782110Um9.LJIILIIL(2131854980, new AcS496S0100000_15(awS2S2200100_15, 6));
                c782110Um9.LJIILL = false;
                c782110Um9.LJIIJ(2131854971, new InterfaceC743640TFa() { // from class: X.0bLq
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                C786410Ut5.E4(c782110Um9.LIZ());
                return;
            }
            awS2S2200100_15.invoke();
        }
    };

    @Override // X.C951190arN
    public final void LLLIIIIL() {
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        CloudDraftItemManager.LIZ(this.LLJJIII);
        C953230auf c953230auf = C953230auf.LIZ;
        C970070bLp c970070bLp = this.LLJILJILJ;
        c953230auf.getClass();
        C953230auf.LJIILL(c970070bLp);
        C953230auf.LJIILL(this.LLJJIJI);
        C953230auf.LJIILL(this.LLJILLL);
        C953230auf.LJIILL(this.LLJJ);
        C953230auf.LJIILL(this.LLJJI);
        super.LLLIIIIL();
    }

    public final void LLLILZ() {
        C410901il c410901il = new C410901il();
        ArrayList arrayList = new ArrayList();
        C953230auf.LIZ.getClass();
        Iterator<NoticeboardTemplate> it2 = C953230auf.LIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        C953230auf.LIZ.getClass();
        List listLLIIII = C13LP.LLIIII(C953230auf.LIZJ);
        if (arrayList.isEmpty()) {
            if (!C934890aR5.LIZ()) {
                c410901il.add(new C970010bLj(0, 0));
            }
            c410901il.add(new C086900Uh());
        } else {
            if (!C934890aR5.LIZ()) {
                c410901il.add(new C970010bLj(0, arrayList.size()));
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c410901il.add(new C953550avB(0, (NoticeboardTemplate) it3.next()));
            }
        }
        if (listLLIIII != null && (!listLLIIII.isEmpty())) {
            c410901il.add(new C970010bLj(1, 0));
            Iterator it4 = listLLIIII.iterator();
            while (it4.hasNext()) {
                c410901il.add(new C953550avB(1, (NoticeboardTemplate) it4.next()));
            }
        }
        LLLII(c410901il);
    }

    @Override // X.AbstractC970120bLu
    public final void LLLIL(RecyclerView recyclerView) {
        LLLI(C970010bLj.class, new C969990bLh());
        LLLI(C953550avB.class, new C953510av7(this.LLILZIL, this.LLJJIJIIJIL, this.LLIZ, this.LLJIJIL));
        LLLI(C086900Uh.class, new C972090bP5(new AwS559S0100000_15(this, 55)));
        if (recyclerView != null) {
            recyclerView.setAdapter(this);
        }
        if (C934890aR5.LIZ()) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.LLILZIL, 2);
            gridLayoutManager.LLIZ = new C986870bmv(this, 2);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.addItemDecoration(new C986880bmw(this, gridLayoutManager, 1));
            }
        } else if (recyclerView != null) {
            SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager(this.LLILZIL);
            sSLinearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(sSLinearLayoutManager);
        }
        C953230auf c953230auf = C953230auf.LIZ;
        C970070bLp c970070bLp = this.LLJILJILJ;
        c953230auf.getClass();
        C953230auf.LIZLLL(1, c970070bLp);
        c953230auf.getClass();
        if ((!C953230auf.LIZJ.isEmpty()) || (!C953230auf.LIZIZ.isEmpty())) {
            LLLILZ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0bLp] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0bLk] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0bLs] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0bLt] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0bLf] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0bLd] */
    public C969930bLb(Context context, DataChannel dataChannel, EnumC952890au7 enumC952890au7, C1819180xRM c1819180xRM, C1819160xRK c1819160xRK, C1819220xRQ c1819220xRQ) {
        this.LLILZIL = context;
        this.LLILZLL = dataChannel;
        this.LLIZ = enumC952890au7;
        this.LLIZLLLIL = c1819180xRM;
        this.LLJ = c1819160xRK;
        this.LLJI = c1819220xRQ;
    }
}
