package X;

import android.database.Cursor;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VMC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMC implements InterfaceC761980Tum {
    public final AbstractC796540VMm LIZ;
    public final C854560Xfi LIZIZ;
    public final C0VME LIZJ = new Object() { // from class: X.0VME
    };
    public final C854550Xfh LIZLLL;

    @Override // X.InterfaceC761980Tum
    public final void LIZIZ() {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC761980Tum
    public final List<SoundEffect> getAll() throws Throwable {
        ImageModel imageModel;
        ImageModel imageModel2;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM sound_effect_database");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "dbId");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "name");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "eng_name");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "version");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlavg_color");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urluri");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlurl_list");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlopen_web_url");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlimage_type");
            int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlis_animated");
            int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlwidth");
            int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlheight");
            try {
                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlisLoaded");
                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlisMonitored");
                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "resource_urlisFeedCandidate");
                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "iconavg_color");
                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "iconuri");
                int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "iconurl_list");
                int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "iconopen_web_url");
                int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "iconimage_type");
                int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "iconis_animated");
                int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "iconwidth");
                int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "iconheight");
                int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "iconisLoaded");
                int iLIZIZ26 = C795450VIh.LIZIZ(cursorLIZIZ, "iconisMonitored");
                int iLIZIZ27 = C795450VIh.LIZIZ(cursorLIZIZ, "iconisFeedCandidate");
                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                while (cursorLIZIZ.moveToNext()) {
                    if (cursorLIZIZ.isNull(iLIZIZ6) && cursorLIZIZ.isNull(iLIZIZ7) && cursorLIZIZ.isNull(iLIZIZ8) && cursorLIZIZ.isNull(iLIZIZ9) && cursorLIZIZ.isNull(iLIZIZ10) && cursorLIZIZ.isNull(iLIZIZ11) && cursorLIZIZ.isNull(iLIZIZ12) && cursorLIZIZ.isNull(iLIZIZ13) && cursorLIZIZ.isNull(iLIZIZ14) && cursorLIZIZ.isNull(iLIZIZ15) && cursorLIZIZ.isNull(iLIZIZ16)) {
                        imageModel = null;
                    } else {
                        imageModel = new ImageModel();
                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                            imageModel.avgColor = null;
                        } else {
                            imageModel.avgColor = cursorLIZIZ.getString(iLIZIZ6);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                            imageModel.mUri = null;
                        } else {
                            imageModel.mUri = cursorLIZIZ.getString(iLIZIZ7);
                        }
                        String string = cursorLIZIZ.isNull(iLIZIZ8) ? null : cursorLIZIZ.getString(iLIZIZ8);
                        getClass();
                        imageModel.mUrls = (List) GsonProtectorUtils.fromJson(new Gson(), string, new TypeToken<List<? extends String>>() { // from class: X.04X1
                        }.getType());
                        if (cursorLIZIZ.isNull(iLIZIZ9)) {
                            imageModel.schema = null;
                        } else {
                            imageModel.schema = cursorLIZIZ.getString(iLIZIZ9);
                        }
                        imageModel.setImageType(cursorLIZIZ.getInt(iLIZIZ10));
                        imageModel.setAnimated(cursorLIZIZ.getInt(iLIZIZ11) != 0);
                        imageModel.width = cursorLIZIZ.getInt(iLIZIZ12);
                        imageModel.height = cursorLIZIZ.getInt(iLIZIZ13);
                        imageModel.setLoaded(cursorLIZIZ.getInt(iLIZIZ14) != 0);
                        imageModel.setMonitored(cursorLIZIZ.getInt(iLIZIZ15) != 0);
                        imageModel.setFeedCandidate(cursorLIZIZ.getInt(iLIZIZ16) != 0);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ17) && cursorLIZIZ.isNull(iLIZIZ18) && cursorLIZIZ.isNull(iLIZIZ19) && cursorLIZIZ.isNull(iLIZIZ20) && cursorLIZIZ.isNull(iLIZIZ21) && cursorLIZIZ.isNull(iLIZIZ22) && cursorLIZIZ.isNull(iLIZIZ23) && cursorLIZIZ.isNull(iLIZIZ24) && cursorLIZIZ.isNull(iLIZIZ25) && cursorLIZIZ.isNull(iLIZIZ26) && cursorLIZIZ.isNull(iLIZIZ27)) {
                        imageModel2 = null;
                    } else {
                        imageModel2 = new ImageModel();
                        if (cursorLIZIZ.isNull(iLIZIZ17)) {
                            imageModel2.avgColor = null;
                        } else {
                            imageModel2.avgColor = cursorLIZIZ.getString(iLIZIZ17);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                            imageModel2.mUri = null;
                        } else {
                            imageModel2.mUri = cursorLIZIZ.getString(iLIZIZ18);
                        }
                        String string2 = cursorLIZIZ.isNull(iLIZIZ19) ? null : cursorLIZIZ.getString(iLIZIZ19);
                        getClass();
                        imageModel2.mUrls = (List) GsonProtectorUtils.fromJson(new Gson(), string2, new TypeToken<List<? extends String>>() { // from class: X.04X1
                        }.getType());
                        if (cursorLIZIZ.isNull(iLIZIZ20)) {
                            imageModel2.schema = null;
                        } else {
                            imageModel2.schema = cursorLIZIZ.getString(iLIZIZ20);
                        }
                        imageModel2.setImageType(cursorLIZIZ.getInt(iLIZIZ21));
                        imageModel2.setAnimated(cursorLIZIZ.getInt(iLIZIZ22) != 0);
                        imageModel2.width = cursorLIZIZ.getInt(iLIZIZ23);
                        imageModel2.height = cursorLIZIZ.getInt(iLIZIZ24);
                        imageModel2.setLoaded(cursorLIZIZ.getInt(iLIZIZ25) != 0);
                        imageModel2.setMonitored(cursorLIZIZ.getInt(iLIZIZ26) != 0);
                        imageModel2.setFeedCandidate(cursorLIZIZ.getInt(iLIZIZ27) != 0);
                    }
                    SoundEffect soundEffect = new SoundEffect();
                    soundEffect.LIZ = cursorLIZIZ.getInt(iLIZIZ);
                    soundEffect.id = cursorLIZIZ.getLong(iLIZIZ2);
                    soundEffect.name = cursorLIZIZ.isNull(iLIZIZ3) ? null : cursorLIZIZ.getString(iLIZIZ3);
                    soundEffect.nameEn = cursorLIZIZ.isNull(iLIZIZ4) ? null : cursorLIZIZ.getString(iLIZIZ4);
                    soundEffect.version = cursorLIZIZ.getLong(iLIZIZ5);
                    soundEffect.resourceUrl = imageModel;
                    soundEffect.iconUrl = imageModel2;
                    arrayList.add(soundEffect);
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VME] */
    public C0VMC(SoundEffectDatabase soundEffectDatabase) {
        this.LIZ = soundEffectDatabase;
        this.LIZIZ = new C854560Xfi(this, soundEffectDatabase, 2);
        this.LIZLLL = new C854550Xfh(soundEffectDatabase, 56);
    }

    @Override // X.InterfaceC761980Tum
    public final void LIZ(List<SoundEffect> list) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            this.LIZIZ.insert((Iterable) list);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }
}
