package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09Kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2355609Kw extends ConcurrentHashMap<String, VEUtils.VEVideoFileInfo> {
    public static final C2355609Kw INSTANCE = new C2355609Kw();
    public static final int $stable = 8;

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, VEUtils.VEVideoFileInfo>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, VEUtils.VEVideoFileInfo>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<VEUtils.VEVideoFileInfo> getValues() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<VEUtils.VEVideoFileInfo> values() {
        return getValues();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj != null && !(obj instanceof VEUtils.VEVideoFileInfo)) {
            return false;
        }
        return containsValue((VEUtils.VEVideoFileInfo) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ VEUtils.VEVideoFileInfo get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public final Map<String, VEUtils.VEVideoFileInfo> recheckCache(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ArrayList arrayList = new ArrayList(parcelableArrayListExtra);
            ArrayList<MediaModel> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                MediaModel mediaModel = (MediaModel) obj;
                if (mediaModel.LJIILJJIL()) {
                    C2355609Kw c2355609Kw = INSTANCE;
                    if (!c2355609Kw.contains(mediaModel.LJFF()) || c2355609Kw.get((Object) mediaModel.LJFF()) == null) {
                        arrayList2.add(obj);
                    }
                }
            }
            for (MediaModel mediaModel2 : arrayList2) {
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(mediaModel2.LJFF());
                if (videoFileInfo != null) {
                    INSTANCE.put(mediaModel2.LJFF(), videoFileInfo);
                }
            }
            return this;
        }
        return this;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ VEUtils.VEVideoFileInfo remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return super.containsValue((Object) vEVideoFileInfo);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ VEUtils.VEVideoFileInfo get(String str) {
        return (VEUtils.VEVideoFileInfo) super.get((Object) str);
    }

    public /* bridge */ VEUtils.VEVideoFileInfo remove(String str) {
        return (VEUtils.VEVideoFileInfo) super.remove((Object) str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (VEUtils.VEVideoFileInfo) obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return false;
        }
        if (obj2 != null && !(obj2 instanceof VEUtils.VEVideoFileInfo)) {
            return false;
        }
        return remove((String) obj, (VEUtils.VEVideoFileInfo) obj2);
    }

    public final /* bridge */ VEUtils.VEVideoFileInfo getOrDefault(Object obj, VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        if (!(obj instanceof String)) {
            return vEVideoFileInfo;
        }
        return getOrDefault((String) obj, vEVideoFileInfo);
    }

    public /* bridge */ boolean remove(String str, VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return super.remove((Object) str, (Object) vEVideoFileInfo);
    }

    public /* bridge */ VEUtils.VEVideoFileInfo getOrDefault(String str, VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return (VEUtils.VEVideoFileInfo) super.getOrDefault((Object) str, vEVideoFileInfo);
    }
}
