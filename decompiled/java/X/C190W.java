package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.SchedulePostTime;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.component.schedule.ScheduleTimePickerFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.190W, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190W extends C193N<InterfaceC855160Xgg, C190T, C10J1> implements InterfaceC855160Xgg {
    public static final C190X LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final Scene LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final MutableLiveData<Long> LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final LiveData<Long> LLJILJILJ;
    public final Function0<C190T> LLJILLL;
    public final C10J1 LLJJ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.190X] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C190W.class, "permissionOptionApi", "getPermissionOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C190W.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C190W.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C190W.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/publish/OnAddAnchorListenerReceiver;", 0)};
        LLJJI = new Object() { // from class: X.190X
        };
        LLJJIJI = 8;
    }

    private final C190Y n5() {
        return (C190Y) this.LLJILJIL.getValue(this, LLJJIII[3]);
    }

    public final void D5() {
        C20684815ws.LJIILLIIL("turn_off_schedule_post", K4());
    }

    @Override // X.InterfaceC855160Xgg
    public void JB() {
        this.LLJIJIL.setValue(null);
        d5().creativeModel.scheduleTime = null;
        i3(AFwS278S0000000_32.get$arr$(88));
    }

    public final C19EG Z4() {
        return (C19EG) this.LLJ.getValue(this, LLJJIII[1]);
    }

    public final VideoPublishEditModel d5() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLJJIII[2]);
    }

    public final InterfaceC855150Xgf k5() {
        return (InterfaceC855150Xgf) this.LLIZLLLIL.getValue(this, LLJJIII[0]);
    }

    public final void v5() {
        C20684815ws.LJIILLIIL("click_schedule_post", K4());
    }

    public final void x5() {
        C20684815ws.LJIILLIIL("close_schedule_post_popup", K4());
    }

    private final void E5() {
        n5().registerOnAddAnchorListener(new AwS566S0100000_22(this, 284));
    }

    private final Map<String, String> K4() {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(d5());
        int iIntValue = pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue();
        int i = iIntValue <= 1 ? iIntValue == 1 ? 0 : -1 : 1;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("creation_id", d5().getCreationId());
        c0lab.LJ("shoot_way", d5().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(d5()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(d5()));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(d5()));
        c0lab.LIZ(i, "is_multi_content");
        c0lab.LJ("enter_from", d5().getEnterFrom());
        c0lab.LJ("after_post", CardStruct.IStatusCode.DEFAULT);
        return c0lab.LIZ;
    }

    @Override // X.InterfaceC855160Xgg
    public Long FH0() {
        return gJ0().getValue();
    }

    public final TuxSheet O4() {
        Long timeSec;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ScheduleTimePickerFragment scheduleTimePickerFragment = new ScheduleTimePickerFragment();
        scheduleTimePickerFragment.LLILLJJLI = Long.valueOf(1800000 + jCurrentTimeMillis);
        scheduleTimePickerFragment.LLILLL = Long.valueOf(jCurrentTimeMillis + 2592000000L);
        SchedulePostTime schedulePostTime = d5().creativeModel.scheduleTime;
        if (schedulePostTime != null && (timeSec = schedulePostTime.getTimeSec()) != null) {
            scheduleTimePickerFragment.LLILZ = Long.valueOf(timeSec.longValue() * 1000);
        }
        scheduleTimePickerFragment.LLILZIL = new AwS636S0100000_22(this, 10);
        TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJI = scheduleTimePickerFragment;
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC21523219La(this, 1);
        return tuxSheet;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        k5().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 156));
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_schedule_post_v2", true)) {
            E5();
        }
    }

    @Override // X.InterfaceC855160Xgg
    public boolean aK0() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Long lFH0 = FH0();
        return lFH0 == null || lFH0.longValue() - jCurrentTimeMillis > 900;
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return EnumC214771193h.SCHEDULE_POST;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return AnonymousClass1937.LIZ;
    }

    public C10J1 T4() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC855160Xgg
    public LiveData<Long> gJ0() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJILLL;
    }

    public final void C5(long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(K4());
        linkedHashMap.put("schedule_time", String.valueOf(j));
        C20684815ws.LJIILLIIL("select_schedule_time", linkedHashMap);
    }

    public final CharSequence P4(Long l) {
        int iIntValue;
        if (l == null) {
            return new SpannableString("");
        }
        String str = new SimpleDateFormat("yyyy-M-d HH:mm", Locale.getDefault()).format(new Date(l.longValue() * 1000));
        if (t5(l)) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, Z4());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final boolean t5(Long l) {
        boolean z;
        boolean z2;
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + 1800;
        if (l == null) {
            return true;
        }
        long jLongValue = l.longValue();
        if (jLongValue < jCurrentTimeMillis) {
            z = true;
        } else {
            z = false;
        }
        long j = 60;
        if (jLongValue / j == jCurrentTimeMillis / j) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || z2) {
            return true;
        }
        return false;
    }

    public C190W(C1DRG c1drg, Scene scene) {
        Long timeSec;
        super(c1drg);
        this.LLIZ = scene;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        SchedulePostTime schedulePostTime = d5().creativeModel.scheduleTime;
        if (schedulePostTime != null) {
            timeSec = schedulePostTime.getTimeSec();
        } else {
            timeSec = null;
        }
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(timeSec);
        this.LLJIJIL = mutableLiveData;
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C190Y.class, null);
        this.LLJILJILJ = mutableLiveData;
        this.LLJILLL = new AwS576S0100000_32(this, 312);
        this.LLJJ = new C10J1(new AwS611S0100000_32(this, 154), new AwS611S0100000_32(this, 155));
    }
}
