package X;

import com.ss.android.ugc.aweme.profile.aigc.ProfileBadgeSettingsObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0CQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313430CQj extends HashMap<String, ProfileBadgeSettingsObject> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, ProfileBadgeSettingsObject>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, ProfileBadgeSettingsObject>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<ProfileBadgeSettingsObject> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<ProfileBadgeSettingsObject> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof ProfileBadgeSettingsObject)) {
            return false;
        }
        return containsValue((ProfileBadgeSettingsObject) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ ProfileBadgeSettingsObject get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ ProfileBadgeSettingsObject remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(ProfileBadgeSettingsObject profileBadgeSettingsObject) {
        return super.containsValue((Object) profileBadgeSettingsObject);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ ProfileBadgeSettingsObject get(String str) {
        return (ProfileBadgeSettingsObject) super.get((Object) str);
    }

    public /* bridge */ ProfileBadgeSettingsObject remove(String str) {
        return (ProfileBadgeSettingsObject) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (ProfileBadgeSettingsObject) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof ProfileBadgeSettingsObject)) {
            return false;
        }
        return remove((String) obj, (ProfileBadgeSettingsObject) obj2);
    }

    public final /* bridge */ ProfileBadgeSettingsObject getOrDefault(Object obj, ProfileBadgeSettingsObject profileBadgeSettingsObject) {
        if (!(obj instanceof String)) {
            return profileBadgeSettingsObject;
        }
        return getOrDefault((String) obj, profileBadgeSettingsObject);
    }

    public /* bridge */ boolean remove(String str, ProfileBadgeSettingsObject profileBadgeSettingsObject) {
        return super.remove((Object) str, (Object) profileBadgeSettingsObject);
    }

    public /* bridge */ ProfileBadgeSettingsObject getOrDefault(String str, ProfileBadgeSettingsObject profileBadgeSettingsObject) {
        return (ProfileBadgeSettingsObject) super.getOrDefault((Object) str, profileBadgeSettingsObject);
    }
}
