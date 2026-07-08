package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS52S0000100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: renamed from: X.0auw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953400auw implements InterfaceC953490av5 {
    public final InterfaceC950700aqa LIZ;
    public final InterfaceC1631620sYq<List<C953540avA>, Boolean, Boolean, Unit> LIZIZ;
    public final C11NJ LIZJ;
    public long LIZLLL;
    public final HashSet<Long> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    public static List LJIIIIZZ() {
        ArrayList arrayList = new ArrayList();
        C953610avH.LJJI.getClass();
        String str = C953610avH.LJJII;
        Long lLJIIIZ = LJIIIZ();
        int templateQuickSelectMaxCount = MultiGuestNoticeboardEditorSetting.INSTANCE.getTemplateQuickSelectMaxCount();
        C953230auf.LIZ.getClass();
        List<NoticeboardTemplate> listLL = C13LP.LL(C953230auf.LIZIZ, templateQuickSelectMaxCount);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        for (NoticeboardTemplate noticeboardTemplate : listLL) {
            C953550avB c953550avB = new C953550avB(0, noticeboardTemplate);
            C953470av3.LIZ.getClass();
            arrayList2.add(new C953540avA(c953550avB, C953470av3.LIZIZ(noticeboardTemplate, str, lLJIIIZ)));
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        int size = templateQuickSelectMaxCount - arrayList.size();
        if (size > 0) {
            C953230auf.LIZ.getClass();
            List<NoticeboardTemplate> listLL2 = C13LP.LL(C953230auf.LIZJ, size);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL2, 10));
            for (NoticeboardTemplate noticeboardTemplate2 : listLL2) {
                C953550avB c953550avB2 = new C953550avB(1, noticeboardTemplate2);
                C953470av3.LIZ.getClass();
                arrayList3.add(new C953540avA(c953550avB2, C953470av3.LIZIZ(noticeboardTemplate2, str, lLJIIIZ)));
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        }
        return arrayList;
    }

    public static Long LJIIIZ() {
        Object next;
        C953610avH.LJJI.getClass();
        String str = C953610avH.LJJII;
        if (str == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) C953760avW.LIZIZ.LIZ().LIZLLL(3, str)).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long j = ((C953770avX) next).LIZJ;
                do {
                    Object next2 = it2.next();
                    long j2 = ((C953770avX) next2).LIZJ;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        C953770avX c953770avX = (C953770avX) next;
        if (c953770avX != null) {
            return c953770avX.LJIIL;
        }
        return null;
    }

    @Override // X.InterfaceC953490av5
    public final void LIZ(long j) {
        C953230auf c953230auf = C953230auf.LIZ;
        EnumC952780atw enumC952780atw = EnumC952780atw.TEMPLATE_DIALOG;
        C953420auy c953420auy = (C953420auy) this.LJI.getValue();
        c953230auf.getClass();
        C953230auf.LJIIZILJ(j, enumC952780atw, null, c953420auy);
    }

    @Override // X.InterfaceC953490av5
    public final void LJFF(long j) {
        C953230auf c953230auf = C953230auf.LIZ;
        C953440av0 c953440av0 = (C953440av0) this.LJII.getValue();
        c953230auf.getClass();
        C953230auf.LIZJ(j, c953440av0);
    }

    @Override // X.InterfaceC953490av5
    public final void LJI(long j) {
        C953230auf c953230auf = C953230auf.LIZ;
        C953440av0 c953440av0 = (C953440av0) this.LJII.getValue();
        c953230auf.getClass();
        C953230auf.LIZJ(j, c953440av0);
    }

    public C953400auw(InterfaceC950700aqa interfaceC950700aqa, C953200auc c953200auc) {
        this.LIZ = interfaceC950700aqa;
        this.LIZIZ = c953200auc;
        C11NJ c11nj = new C11NJ();
        this.LIZJ = c11nj;
        this.LJ = new HashSet<>();
        this.LJFF = C292401Bi.LIZ(new AwS559S0100000_15(this, 644));
        this.LJI = C292401Bi.LIZ(new AwS559S0100000_15(this, 636));
        this.LJII = C292401Bi.LIZ(new AwS559S0100000_15(this, 641));
        this.LJIIIIZZ = C292401Bi.LIZ(new AwS559S0100000_15(this, 637));
        this.LJIIIZ = C292401Bi.LIZ(new AwS559S0100000_15(this, 640));
        this.LJIIJ = C292401Bi.LIZ(new AwS559S0100000_15(this, 643));
        LifecycleOwner lifecycleOwnerLJJJJ = interfaceC950700aqa.LJJJJ();
        if (lifecycleOwnerLJJJJ != null) {
            PlaybookUtilKt.LJJII(lifecycleOwnerLJJJJ, new AwS559S0100000_15(this, 638));
        }
        C953610avH.LJJI.getClass();
        c11nj.LIZ(new C11IW(C953610avH.LJJIII.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 109))).LJIILL().LJIIZILJ());
    }

    @Override // X.InterfaceC953490av5
    public final void LIZJ(int i, String str) {
        C953230auf c953230auf = C953230auf.LIZ;
        C953320auo c953320auo = (C953320auo) this.LJIIIZ.getValue();
        c953230auf.getClass();
        C953230auf.LIZ(str, c953320auo);
    }

    public static C953100auS LJII(Context context, DataChannel dataChannel, C916750Zxp c916750Zxp) {
        return new C953100auS(context, dataChannel, EnumC952890au7.DESIGN_PANEL, c916750Zxp, AFwS250S0000000_15.get$arr$(160), new C953140auW(), AFwS250S0000000_15.get$arr$(161), AFwS203S0000000_15.get$arr$(264), null, 768);
    }

    @Override // X.InterfaceC953490av5
    public final void LIZLLL(int i, long j, String str) {
        C953230auf c953230auf = C953230auf.LIZ;
        C953430auz c953430auz = (C953430auz) this.LJIIIIZZ.getValue();
        c953230auf.getClass();
        C953230auf.LJIJI(str, j, i, c953430auz);
    }

    @Override // X.InterfaceC953490av5
    public final void LJ(long j, String str, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        C176600m4.LIZJ(new AwS52S0000100_15(this.LIZLLL, 0));
        CloudDraftItemManager.LJFF(j, (C953450av1) this.LJIIJ.getValue(), str, null, convertNoticeboardMaterialInfo);
        this.LIZLLL = j;
    }

    public final void LJIIJ(List<C953540avA> list, boolean z, boolean z2) {
        this.LIZIZ.invoke(list, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    @Override // X.InterfaceC953490av5
    public final void LIZIZ(long j, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
        DataChannel dataChannel;
        Context context = this.LIZ.getContext();
        if (context == null || (dataChannel = this.LIZ.getDataChannel()) == null) {
            return;
        }
        new C953410aux(j, str2, str, convertNoticeboardMaterialInfo, LJII(context, dataChannel, new C916750Zxp(2, j, str)), this).invoke();
    }
}
