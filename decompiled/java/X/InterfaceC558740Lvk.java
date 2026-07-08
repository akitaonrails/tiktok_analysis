package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Lvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC558740Lvk extends C05YF {
    boolean F30(CreativeModel creativeModel, C0LSZ c0lsz);

    void Fx(CreativeModel creativeModel, C0LSZ c0lsz);

    void Qy(boolean z, String str, String str2, boolean z2);

    void Xv1(VideoPublishEditModel videoPublishEditModel, PromptModel promptModel, String str, long j);

    void Zq1(NLETrackSlot nLETrackSlot, CreativeModel creativeModel);

    void bm(long j);

    void ec2(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot);

    void ew1(String str, boolean z);

    String getSource();

    long getStartTime();

    String getTag();

    String getTaskType();

    void jA0(CreativeModel creativeModel, C0LSZ c0lsz);

    void k72(VideoPublishEditModel videoPublishEditModel, C0LSZ c0lsz, C0MCA c0mca);

    void qO(VideoPublishEditModel videoPublishEditModel, String str);
}
