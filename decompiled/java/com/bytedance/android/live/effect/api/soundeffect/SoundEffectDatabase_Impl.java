package com.bytedance.android.live.effect.api.soundeffect;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VMC;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC761980Tum;
import X.InterfaceC796190VLd;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class SoundEffectDatabase_Impl extends SoundEffectDatabase {
    public volatile C0VMC LLILLJJLI;

    @Override // com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase
    public final InterfaceC761980Tum LIZ() {
        C0VMC c0vmc;
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new C0VMC(this);
                }
                c0vmc = this.LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vmc;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `sound_effect_database`");
            super.setTransactionSuccessful();
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (c0vlfLJLJJI.LJJIJIIJI()) {
                return;
            }
            c0vlfLJLJJI.LJIILJJIL("VACUUM");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!c0vlfLJLJJI.LJJIJIIJI()) {
                c0vlfLJLJJI.LJIILJJIL("VACUUM");
            }
            throw th;
        }
    }

    @Override // X.AbstractC796540VMm
    public final C796620VMu createInvalidationTracker() {
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "sound_effect_database");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC761980Tum.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VMB
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(3);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `sound_effect_database` (`dbId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` INTEGER NOT NULL, `name` TEXT NOT NULL, `eng_name` TEXT NOT NULL, `version` INTEGER NOT NULL, `resource_urlavg_color` TEXT, `resource_urluri` TEXT, `resource_urlurl_list` TEXT, `resource_urlopen_web_url` TEXT, `resource_urlimage_type` INTEGER, `resource_urlis_animated` INTEGER, `resource_urlwidth` INTEGER, `resource_urlheight` INTEGER, `resource_urlisLoaded` INTEGER, `resource_urlisMonitored` INTEGER, `resource_urlisFeedCandidate` INTEGER, `iconavg_color` TEXT, `iconuri` TEXT, `iconurl_list` TEXT, `iconopen_web_url` TEXT, `iconimage_type` INTEGER, `iconis_animated` INTEGER, `iconwidth` INTEGER, `iconheight` INTEGER, `iconisLoaded` INTEGER, `iconisMonitored` INTEGER, `iconisFeedCandidate` INTEGER)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1f5f69edf7ad8512f8d862dfe970fcfb')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `sound_effect_database`");
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onCreate(C0VLF c0vlf) {
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onOpen(C0VLF c0vlf) {
                this.LIZ.mDatabase = c0vlf;
                this.LIZ.internalInitInvalidationTracker(c0vlf);
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0VK6) ListProtector.get(this.LIZ.mCallbacks, i)).LIZ(c0vlf);
                    }
                }
            }

            @Override // X.C0VN3
            public final void onPreMigrate(C0VLF c0vlf) {
                C0VN0.LIZ(c0vlf);
            }

            @Override // X.C0VN3
            public final C0VN4 onValidateSchema(C0VLF c0vlf) {
                HashMap map = new HashMap(27);
                map.put("dbId", new C795990VKj(1, 1, "dbId", "INTEGER", null, true));
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(0, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map.put("name", new C795990VKj(0, 1, "name", "TEXT", null, true));
                map.put("eng_name", new C795990VKj(0, 1, "eng_name", "TEXT", null, true));
                map.put("version", new C795990VKj(0, 1, "version", "INTEGER", null, true));
                map.put("resource_urlavg_color", new C795990VKj(0, 1, "resource_urlavg_color", "TEXT", null, false));
                map.put("resource_urluri", new C795990VKj(0, 1, "resource_urluri", "TEXT", null, false));
                map.put("resource_urlurl_list", new C795990VKj(0, 1, "resource_urlurl_list", "TEXT", null, false));
                map.put("resource_urlopen_web_url", new C795990VKj(0, 1, "resource_urlopen_web_url", "TEXT", null, false));
                map.put("resource_urlimage_type", new C795990VKj(0, 1, "resource_urlimage_type", "INTEGER", null, false));
                map.put("resource_urlis_animated", new C795990VKj(0, 1, "resource_urlis_animated", "INTEGER", null, false));
                map.put("resource_urlwidth", new C795990VKj(0, 1, "resource_urlwidth", "INTEGER", null, false));
                map.put("resource_urlheight", new C795990VKj(0, 1, "resource_urlheight", "INTEGER", null, false));
                map.put("resource_urlisLoaded", new C795990VKj(0, 1, "resource_urlisLoaded", "INTEGER", null, false));
                map.put("resource_urlisMonitored", new C795990VKj(0, 1, "resource_urlisMonitored", "INTEGER", null, false));
                map.put("resource_urlisFeedCandidate", new C795990VKj(0, 1, "resource_urlisFeedCandidate", "INTEGER", null, false));
                map.put("iconavg_color", new C795990VKj(0, 1, "iconavg_color", "TEXT", null, false));
                map.put("iconuri", new C795990VKj(0, 1, "iconuri", "TEXT", null, false));
                map.put("iconurl_list", new C795990VKj(0, 1, "iconurl_list", "TEXT", null, false));
                map.put("iconopen_web_url", new C795990VKj(0, 1, "iconopen_web_url", "TEXT", null, false));
                map.put("iconimage_type", new C795990VKj(0, 1, "iconimage_type", "INTEGER", null, false));
                map.put("iconis_animated", new C795990VKj(0, 1, "iconis_animated", "INTEGER", null, false));
                map.put("iconwidth", new C795990VKj(0, 1, "iconwidth", "INTEGER", null, false));
                map.put("iconheight", new C795990VKj(0, 1, "iconheight", "INTEGER", null, false));
                map.put("iconisLoaded", new C795990VKj(0, 1, "iconisLoaded", "INTEGER", null, false));
                map.put("iconisMonitored", new C795990VKj(0, 1, "iconisMonitored", "INTEGER", null, false));
                map.put("iconisFeedCandidate", new C795990VKj(0, 1, "iconisFeedCandidate", "INTEGER", null, false));
                C0VN6 c0vn6 = new C0VN6("sound_effect_database", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "sound_effect_database");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sound_effect_database(com.bytedance.android.live.effect.api.soundeffect.SoundEffect).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "1f5f69edf7ad8512f8d862dfe970fcfb", "602aa792e5da8c5c7d64ed7e865a5651");
        C0VKN c0vkn = new C0VKN(c796520VMk.LIZIZ);
        c0vkn.LIZIZ = c796520VMk.LIZJ;
        c0vkn.LIZJ = c0vn2;
        return c796520VMk.LIZ.LIZ(c0vkn.LIZ());
    }

    @Override // X.AbstractC796540VMm
    public final List<AbstractC796510VMj> getAutoMigrations(Map<Class<? extends InterfaceC2275591E5d>, InterfaceC2275591E5d> map) {
        return Arrays.asList(new AbstractC796510VMj[0]);
    }
}
