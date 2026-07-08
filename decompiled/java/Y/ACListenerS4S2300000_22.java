package Y;

import X.C0CHQ;
import X.C0CNO;
import X.C0LAB;
import X.C19222410Ic;
import X.C20684815ws;
import X.C857680Xkk;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.util.HashMap;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import uxk.a;

/* JADX INFO: loaded from: classes23.dex */
public class ACListenerS4S2300000_22 implements View.OnClickListener {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1 = "video_edit_page";

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS4S2300000_22 aCListenerS4S2300000_22, View view) {
        String str;
        String str2;
        int duetVideoDuration;
        String duetLayout;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS4S2300000_22.l3;
        String str3 = aCListenerS4S2300000_22.s0;
        String str4 = aCListenerS4S2300000_22.s1;
        HashMap map = (HashMap) aCListenerS4S2300000_22.l4;
        CommonSettingItemStatus commonSettingItemStatus = ((C19222410Ic) aCListenerS4S2300000_22.l2).LIZ;
        if (commonSettingItemStatus._isDisabled) {
            if (C857680Xkk.LIZIZ(videoPublishEditModel)) {
                C0CNO.LIZLLL(0L, new AwS558S0100000_14(view, 1111));
                return;
            }
            return;
        }
        C0CHQ.LIZ().LJJIIZI().LJJIIJZLJL();
        MutableLiveData<Boolean> mutableLiveData = commonSettingItemStatus._checked;
        Boolean value = mutableLiveData.getValue();
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(Boolean.valueOf(!Intrinsics.LJFF(value, bool)));
        int i = !Intrinsics.LJFF(commonSettingItemStatus._checked.getValue(), bool) ? 1 : 0;
        videoPublishEditModel.reactDuetSetting = i;
        a.LIZ.getClass();
        a.LJIIIIZZ(i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("enter_from", str4);
        if (Intrinsics.LJFF(commonSettingItemStatus._checked.getValue(), bool)) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("to_status", str);
        if (map != null) {
            str2 = (String) map.get("shoot_way");
        } else {
            str2 = null;
        }
        c0lab.LJ("shoot_way", str2);
        if (videoPublishEditModel.isDuet()) {
            duetVideoDuration = videoPublishEditModel.getDuetVideoDuration();
        } else {
            duetVideoDuration = 0;
        }
        c0lab.LIZ(duetVideoDuration, "duet_video_duration");
        c0lab.LIZ(videoPublishEditModel.getDuetFromDuetButton(), "is_from_duet_button");
        if (videoPublishEditModel.isDuet()) {
            duetLayout = videoPublishEditModel.getDuetLayout();
        } else {
            duetLayout = "";
        }
        c0lab.LJ("duet_layout", duetLayout);
        c0lab.LIZ(videoPublishEditModel.getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_react_duet_control", c0lab.LIZ);
    }

    public static final void onClick$1(ACListenerS4S2300000_22 aCListenerS4S2300000_22, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        int stitchVideoDuration;
        boolean zLIZIZ = C857680Xkk.LIZIZ((VideoPublishEditModel) aCListenerS4S2300000_22.l2);
        if (((CommonSettingItemStatus) aCListenerS4S2300000_22.l3)._isDisabled && zLIZIZ) {
            C0CNO.LIZLLL(0L, new AwS566S0100000_22(view, 329));
            return;
        }
        C0CHQ.LIZ().LJJIIZI().LJJJJJL();
        MutableLiveData<Boolean> mutableLiveData = ((CommonSettingItemStatus) aCListenerS4S2300000_22.l3)._checked;
        Boolean value = mutableLiveData.getValue();
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(Boolean.valueOf(!Intrinsics.LJFF(value, bool)));
        C0CHQ.LIZ().LJJIIZI().LJIJJLI(!Intrinsics.LJFF(((CommonSettingItemStatus) aCListenerS4S2300000_22.l3)._checked.getValue(), bool) ? 1 : 0);
        ((VideoPublishEditModel) aCListenerS4S2300000_22.l2).stitchSetting = !Intrinsics.LJFF(((CommonSettingItemStatus) aCListenerS4S2300000_22.l3)._checked.getValue(), bool) ? 1 : 0;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", aCListenerS4S2300000_22.s0);
        c0lab.LJ("enter_from", aCListenerS4S2300000_22.s1);
        if (Intrinsics.LJFF(((CommonSettingItemStatus) aCListenerS4S2300000_22.l3)._checked.getValue(), bool)) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("to_status", str);
        HashMap map = (HashMap) aCListenerS4S2300000_22.l4;
        Object objValueOf = null;
        if (map != null) {
            str2 = (String) map.get("content_type");
        } else {
            str2 = null;
        }
        c0lab.LJ("content_type", str2);
        HashMap map2 = (HashMap) aCListenerS4S2300000_22.l4;
        if (map2 != null) {
            str3 = (String) map2.get("content_source");
        } else {
            str3 = null;
        }
        c0lab.LJ("content_source", str3);
        HashMap map3 = (HashMap) aCListenerS4S2300000_22.l4;
        if (map3 != null) {
            str4 = (String) map3.get("shoot_way");
        } else {
            str4 = null;
        }
        c0lab.LJ("shoot_way", str4);
        if (((VideoPublishEditModel) aCListenerS4S2300000_22.l2).isStitchMode()) {
            StitchParams stitchParams = ((VideoPublishEditModel) aCListenerS4S2300000_22.l2).getStitchParams();
            if (stitchParams != null) {
                stitchVideoDuration = stitchParams.getStitchVideoDuration();
            }
            c0lab.LIZLLL(objValueOf, "stitch_video_duration");
            c0lab.LIZ(((VideoPublishEditModel) aCListenerS4S2300000_22.l2).getVideoLength(), "creation_duration");
            C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
        }
        stitchVideoDuration = 0;
        objValueOf = Integer.valueOf(stitchVideoDuration);
        c0lab.LIZLLL(objValueOf, "stitch_video_duration");
        c0lab.LIZ(((VideoPublishEditModel) aCListenerS4S2300000_22.l2).getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
    }

    public ACListenerS4S2300000_22(C19222410Ic c19222410Ic, VideoPublishEditModel videoPublishEditModel, String str, HashMap map, int i) {
        this.$t = i;
        this.l2 = c19222410Ic;
        this.l3 = videoPublishEditModel;
        this.s0 = str;
        this.l4 = map;
    }

    public ACListenerS4S2300000_22(VideoPublishEditModel videoPublishEditModel, CommonSettingItemStatus commonSettingItemStatus, String str, HashMap map, int i) {
        this.$t = i;
        this.l2 = videoPublishEditModel;
        this.l3 = commonSettingItemStatus;
        this.s0 = str;
        this.l4 = map;
    }
}
