package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC554090LoF extends C05YF {
    LiveData<C549360Lgc> Ao();

    void Bc(List<MentionDataItem> list);

    LiveData<C551390Ljt> Po();

    void R9(boolean z, List<MentionDataItem> list);

    void Y1(InterfaceC549270LgT interfaceC549270LgT, MentionDataItem mentionDataItem);

    LiveData<C551290Ljj> Yb();

    List<Pair<MentionDataItem, MentionDataItem>> de();

    C1267504xd getCurrentState();

    LiveData<List<MentionDataItem>> nn();

    void r9(int i, MentionDataItem mentionDataItem);

    LiveData<C551290Ljj> rg();

    void t2(List<MentionDataItem> list, boolean z);
}
