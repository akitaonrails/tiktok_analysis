package X;

import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MHP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public interface C0MHP extends C05YF {
    void CR0(boolean z, boolean z2, long j, String str);

    void F40(boolean z, Function1<? super NLEModel, Unit> function1);

    C443120HZe<Long, Long, String> Hq2();

    void PK();

    void Tx1(NLEModel nLEModel);

    List<EditVideoSegment> ZU1();

    Long getMusicId();

    MusicObject uE1();

    Object zt0(Intent intent, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);
}
