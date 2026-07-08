package X;

import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC366450EYh extends C05YF {
    LiveData<C189200o6<Pair<List<ResourceItem>, Boolean>>> Hy0();

    void LC1(boolean z);

    void MT1();

    Object N82(boolean z, Pair<? extends List<C0EQL>, C05WK> pair, boolean z2, C1426205i8 c1426205i8, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void NJ0(boolean z);

    LiveEvent<C375830EoP<AbstractC366540EYq>> Qq2();

    LiveData<AbstractC366540EYq> Sz2();

    void US1(boolean z, String str);

    Object Uu0(boolean z, List<? extends AVMusic> list, String str, InterfaceC1364105Vn<? super Pair<? extends List<C0EQL>, C05WK>> interfaceC1364105Vn);

    String VQ0(boolean z);

    void ZJ2(String str);

    boolean aL(boolean z);

    void bA(boolean z);

    String fC1(boolean z, String str);

    String gA1(boolean z);

    void jV(boolean z);

    boolean kC(String str, boolean z, boolean z2);

    void l71(List<LyricStickerModel> list);

    Object nG1(boolean z, List<? extends AVMusic> list, String str, String str2, C05WF c05wf, InterfaceC1364105Vn<? super Pair<? extends List<C0EQL>, C05WK>> interfaceC1364105Vn);

    void ow2();

    C0EQM pv2(String str, String str2, String str3);

    LiveData<Boolean> q72();

    boolean wH0(boolean z);

    Object x12(boolean z, List<? extends AVMusic> list, ResourceItem resourceItem, String str, C05WF c05wf, InterfaceC1364105Vn<? super Pair<? extends List<C0EQL>, C05WK>> interfaceC1364105Vn);

    String x41();

    Object yQ0(boolean z, Pair<? extends List<C0EQL>, C05WK> pair, boolean z2, C1426205i8 c1426205i8, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void yS(boolean z);
}
