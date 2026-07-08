package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api.SoundEffectListApiResponse;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.11ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19552511ed {
    public final List<SoundEffectTabModel> LIZ = Collections.synchronizedList(new ArrayList());
    public final ConcurrentHashMap<String, SoundEffectListApiResponse> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public final HashSet<String> LIZLLL = new HashSet<>();
    public boolean LJ;
    public C0EU6 LJFF;

    public final void LIZ(ArrayList arrayList, int i, int i2, String str) {
        if (this.LIZIZ.containsKey(str)) {
            SoundEffectListApiResponse soundEffectListApiResponse = this.LIZIZ.get(str);
            if (soundEffectListApiResponse != null) {
                ArrayList<SoundEffect> arrayList2 = soundEffectListApiResponse.list;
                if (arrayList2 != null) {
                    arrayList2.addAll(arrayList);
                }
                soundEffectListApiResponse.LL = Integer.valueOf(i);
                soundEffectListApiResponse.hasMore = Integer.valueOf(i2);
                return;
            }
            return;
        }
        SoundEffectListApiResponse soundEffectListApiResponse2 = new SoundEffectListApiResponse();
        soundEffectListApiResponse2.LL = Integer.valueOf(i);
        soundEffectListApiResponse2.list = arrayList;
        soundEffectListApiResponse2.hasMore = Integer.valueOf(i2);
        this.LIZIZ.put(str, soundEffectListApiResponse2);
    }
}
