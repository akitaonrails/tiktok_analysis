package X;

import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS566S0100000_22;
import lth.o;

/* JADX INFO: renamed from: X.0nYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439220nYW extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1439220nYW.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this;
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLILLL[0]);
    }

    public final void W1() {
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            return;
        }
        String str = getShortVideoContext().shootWay;
        if (str == null) {
            str = "";
        }
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putString("shoot_way", str);
        C1499900p8O.LIZ(editorEdit);
        C1439190nYT.LJFF(getShortVideoContext().creativeInfo);
        boolean z = getShortVideoContext().creativeModel.micDataModel.recordOriginalSoundWithBGM;
        SharedPreferences.Editor editorEdit2 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit2.putBoolean("record_original_sound_with_bgm", z);
        C1499900p8O.LIZ(editorEdit2);
        String str2 = C1443560nfW.LJ;
        SharedPreferences.Editor editorEdit3 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit3.putString("from_item_id", str2);
        C1499900p8O.LIZ(editorEdit3);
        String str3 = getShortVideoContext().creativeModel.followUpPublishTrackerModel.followUpFirstItemId;
        if (str3 == null) {
            str3 = "";
        }
        SharedPreferences.Editor editorEdit4 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit4.putString("follow_up_first_item_id", str3);
        C1499900p8O.LIZ(editorEdit4);
        String str4 = getShortVideoContext().creativeModel.followUpPublishTrackerModel.followUpItemIdGroups;
        if (str4 == null) {
            str4 = "";
        }
        SharedPreferences.Editor editorEdit5 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit5.putString("follow_up_item_id_groups", str4);
        C1499900p8O.LIZ(editorEdit5);
        C1439190nYT.LJI(Boolean.valueOf(getShortVideoContext().creativeModel.followUpPublishTrackerModel.enterRecordFromFeed));
        String str5 = getShortVideoContext().creativeModel.followUpPublishTrackerModel.followUpPromoId;
        Keva.getRepo("publish").storeString("follow_up_promo_id", str5 != null ? str5 : "");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        o.LJIL.LJIIJ().LIZ();
        C0CHQ.LIZ().LJIIJ().LIZJ("in to record", new AwS566S0100000_22(this, 281));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1439220nYW(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
