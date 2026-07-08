package X;

import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.053I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C053I<T> {
    List<String> LJ();

    void LJFF(Object obj, String str);

    void LJI(String str);

    boolean LJII(FrequencyMarkRecord frequencyMarkRecord);

    Pair<Boolean, T> getData(String str);
}
