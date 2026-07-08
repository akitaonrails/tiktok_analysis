package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0peV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519810peV extends Keva {
    public final Keva LIZ;

    static {
        Npth.addAttachUserData(new AttachUserData() { // from class: X.0Vga
            @Override // com.bytedance.crash.AttachUserData
            public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                if (crashType != CrashType.ANR && crashType != CrashType.JAVA && crashType != CrashType.LAUNCH && crashType != CrashType.CUSTOM_JAVA && crashType != CrashType.NATIVE && crashType != CrashType.OOM) {
                    return null;
                }
                String json = GsonProtectorUtils.toJson(C08JS.LIZIZ(), C308170C6d.LIZ());
                HashMap map = new HashMap();
                map.put("ab_vids", json);
                return map;
            }
        }, CrashType.ALL);
    }

    @Override // com.bytedance.keva.Keva
    public final void clear() {
        this.LIZ.clear();
    }

    @Override // com.bytedance.keva.Keva
    public final int count() {
        return this.LIZ.count();
    }

    @Override // com.bytedance.keva.Keva
    public final void dump() {
        this.LIZ.dump();
    }

    @Override // com.bytedance.keva.Keva
    public final Map<String, ?> getAll() {
        return this.LIZ.getAll();
    }

    @Override // com.bytedance.keva.Keva
    public final Set<String> getAllKey() {
        return this.LIZ.getAllKey();
    }

    @Override // com.bytedance.keva.Keva
    public final String name() {
        return this.LIZ.name();
    }

    public C1519810peV(Keva keva) {
        this.LIZ = keva;
        C308170C6d.LIZ = true;
        C308320C6s c308320C6s = C308320C6s.LIZ;
        HashSet<InterfaceC308180C6e> hashSet = C308170C6d.LIZLLL;
        if (!hashSet.contains(c308320C6s)) {
            hashSet.add(c308320C6s);
        }
    }

    @Override // com.bytedance.keva.Keva
    public final Map<String, Object> buildNewMap(Map<String, Object> map) {
        return this.LIZ.buildNewMap(map);
    }

    @Override // com.bytedance.keva.Keva
    public final boolean contains(String str) {
        return this.LIZ.contains(str);
    }

    @Override // com.bytedance.keva.Keva
    public final void erase(String str) {
        this.LIZ.erase(str);
    }

    @Override // com.bytedance.keva.Keva
    public final void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        this.LIZ.registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva
    public final void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        this.LIZ.unRegisterChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva
    public final boolean getBoolean(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public final byte[] getBytes(String str, byte[] bArr) {
        return this.LIZ.getBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public final byte[] getBytesJustDisk(String str, byte[] bArr) {
        return this.LIZ.getBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public final double getDouble(String str, double d) {
        return this.LIZ.getDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public final float getFloat(String str, float f) {
        return this.LIZ.getFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public final int getInt(String str, int i) {
        return this.LIZ.getInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public final long getLong(String str, long j) {
        return this.LIZ.getLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public final String getString(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public final String[] getStringArray(String str, String[] strArr) {
        return this.LIZ.getStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public final String[] getStringArrayJustDisk(String str, String[] strArr) {
        return this.LIZ.getStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public final String getStringJustDisk(String str, String str2) {
        return this.LIZ.getStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public final Set<String> getStringSet(String str, Set<String> set) {
        return this.LIZ.getStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public final Set<String> getStringSetJustDisk(String str, Set<String> set) {
        return this.LIZ.getStringSetJustDisk(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeBoolean(String str, boolean z) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeBytes(String str, byte[] bArr) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeBytesJustDisk(String str, byte[] bArr) {
        this.LIZ.storeBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeDouble(String str, double d) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeFloat(String str, float f) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeInt(String str, int i) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeLong(String str, long j) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeString(String str, String str2) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeString(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeStringArray(String str, String[] strArr) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeStringArrayJustDisk(String str, String[] strArr) {
        this.LIZ.storeStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeStringJustDisk(String str, String str2) {
        this.LIZ.storeStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeStringSet(String str, Set<String> set) {
        C308320C6s.LIZIZ(str);
        this.LIZ.storeStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public final void storeStringSetJustDisk(String str, Set<String> set) {
        this.LIZ.storeStringSetJustDisk(str, set);
    }
}
