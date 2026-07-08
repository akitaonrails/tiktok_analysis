package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414150mu5 {
    public static NLEModel LIZ;
    public static final ConcurrentHashMap<String, Pair<Asset, Pair<NLEModel, AVMusic>>> LIZIZ = new ConcurrentHashMap<>();

    public static Asset LIZ(InterfaceC1452170ntP interfaceC1452170ntP) {
        Object next;
        String uuid;
        String uuid2;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        Iterator<T> it2 = LIZIZ.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack mainTrack2 = ((NLEModel) ((Pair) ((Pair) next).getSecond()).getFirst()).getMainTrack();
                if (mainTrack2 != null) {
                    uuid = mainTrack2.getUUID();
                } else {
                    uuid = null;
                }
                if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null) {
                    uuid2 = mainTrack.getUUID();
                } else {
                    uuid2 = null;
                }
                if (Intrinsics.LJFF(uuid, uuid2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair == null) {
            return null;
        }
        return (Asset) pair.getFirst();
    }

    public static Pair LIZIZ(Asset asset) {
        Pair<NLEModel, AVMusic> second;
        Pair<Asset, Pair<NLEModel, AVMusic>> pair = LIZIZ.get(asset.getAsset_id());
        if (pair != null && (second = pair.getSecond()) != null) {
            return new Pair(second.getFirst(), second.getSecond());
        }
        return null;
    }

    public static void LIZJ(Asset asset, NLEModel nLEModel, AVMusic aVMusic) {
        LIZIZ.put(asset.getAsset_id(), new Pair<>(asset, new Pair(nLEModel, aVMusic)));
    }
}
