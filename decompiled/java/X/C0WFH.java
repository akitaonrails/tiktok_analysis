package X;

import Y.ARunnableS0S3100000_13;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFH extends C0WFI {
    public final Context LIZJ;
    public final String LIZLLL;

    @Override // X.C0WFI, X.InterfaceC810050Vq7
    public final SharedPreferences.Editor edit() {
        final Context context = this.LIZJ;
        final SharedPreferences.Editor editorEdit = super.edit();
        return new SharedPreferences.Editor(context, editorEdit) { // from class: X.0WFJ
            public final Context LIZ;
            public final Map<String, String> LIZIZ = new ConcurrentHashMap();
            public final SharedPreferences.Editor LIZJ;

            public final void LIZ() {
                for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                    new ARunnableS0S3100000_13(this.LIZ, this.LIZLLL.LIZLLL, (String) entry.getKey(), (String) entry.getValue(), 1).run();
                }
                ((ConcurrentHashMap) this.LIZIZ).clear();
            }

            @Override // android.content.SharedPreferences.Editor
            public final void apply() {
                this.LIZJ.apply();
                LIZ();
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor clear() {
                throw new UnsupportedOperationException("clear not support");
            }

            @Override // android.content.SharedPreferences.Editor
            public final boolean commit() {
                boolean zCommit = this.LIZJ.commit();
                LIZ();
                return zCommit;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor remove(String str) {
                this.LIZJ.remove(str);
                ((ConcurrentHashMap) this.LIZIZ).remove(str);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putBoolean(String str, boolean z) {
                this.LIZJ.putBoolean(str, z);
                if (z == this.LIZLLL.getBoolean(str, false)) {
                    ((ConcurrentHashMap) this.LIZIZ).remove(str);
                    return this;
                }
                ((ConcurrentHashMap) this.LIZIZ).put(str, "boolean");
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putFloat(String str, float f) {
                this.LIZJ.putFloat(str, f);
                if (f == this.LIZLLL.getFloat(str, 0.0f)) {
                    ((ConcurrentHashMap) this.LIZIZ).remove(str);
                    return this;
                }
                ((ConcurrentHashMap) this.LIZIZ).put(str, "float");
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putInt(String str, int i) {
                this.LIZJ.putInt(str, i);
                if (i == this.LIZLLL.getInt(str, 0)) {
                    ((ConcurrentHashMap) this.LIZIZ).remove(str);
                    return this;
                }
                ((ConcurrentHashMap) this.LIZIZ).put(str, "integer");
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putLong(String str, long j) {
                this.LIZJ.putLong(str, j);
                if (j == this.LIZLLL.getLong(str)) {
                    ((ConcurrentHashMap) this.LIZIZ).remove(str);
                    return this;
                }
                ((ConcurrentHashMap) this.LIZIZ).put(str, "long");
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putString(String str, String str2) {
                this.LIZJ.putString(str, str2);
                if (TextUtils.equals(this.LIZLLL.getString(str, null), str2)) {
                    ((ConcurrentHashMap) this.LIZIZ).remove(str);
                    return this;
                }
                ((ConcurrentHashMap) this.LIZIZ).put(str, "string");
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
                throw new UnsupportedOperationException("not support putStringSet");
            }

            {
                this.LIZ = context;
                this.LIZJ = editorEdit;
            }
        };
    }

    public C0WFH(Context context, String str) {
        super(context, str);
        this.LIZLLL = str;
        this.LIZJ = context;
    }
}
