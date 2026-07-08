package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0zhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906090zhX {
    public static Object LIZ(Class cls) {
        final Context contextN3;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ != null && (contextN3 = C786410Ut5.N3(contextLIZ)) != null && cls.isInterface()) {
            if (InterfaceC801570VcR.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1944007jS.LIZ;
                Object obj = concurrentHashMap.get(cls);
                if (obj == null || !(obj instanceof C801560VcQ)) {
                    InterfaceC801570VcR interfaceC801570VcR = new InterfaceC801570VcR(contextN3) { // from class: X.0VcQ
                        public final SharedPreferences LIZ;

                        @Override // X.InterfaceC801570VcR
                        public final void LIZ() {
                            SharedPreferences.Editor editorEdit = this.LIZ.edit();
                            editorEdit.putBoolean("si_show_user_feed_back_point", true);
                            editorEdit.apply();
                        }

                        {
                            this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "aweme-app");
                        }
                    };
                    concurrentHashMap.put(cls, interfaceC801570VcR);
                    return interfaceC801570VcR;
                }
                return obj;
            }
            if (InterfaceC19252710Tt.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C1944007jS.LIZ;
                Object obj2 = concurrentHashMap2.get(cls);
                if (obj2 != null && (obj2 instanceof C1906100zhY)) {
                    return obj2;
                }
                InterfaceC19252710Tt interfaceC19252710Tt = new InterfaceC19252710Tt(contextN3) { // from class: X.0zhY
                    public final Keva LIZ;

                    {
                        this.LIZ = KevaImpl.getRepoFromSp(contextN3, "TutorialVideoPreference", 0);
                    }

                    @Override // X.InterfaceC19252710Tt
                    public final void LIZ(String str) {
                        this.LIZ.storeString("tutorial_video_icon", str);
                    }

                    @Override // X.InterfaceC19252710Tt
                    public final void LIZIZ(String str) {
                        this.LIZ.storeString("tutorial_video_desc", str);
                    }

                    @Override // X.InterfaceC19252710Tt
                    public final void LIZJ(String str) {
                        this.LIZ.storeString("tutorial_video_title", str);
                    }

                    @Override // X.InterfaceC19252710Tt
                    public final void LIZLLL(String str) {
                        this.LIZ.storeString("tutorial_video_deep_link", str);
                    }

                    @Override // X.InterfaceC19252710Tt
                    public final void LJ(String str) {
                        this.LIZ.storeString("tutorial_video_msg_id", str);
                    }

                    @Override // X.InterfaceC19252710Tt
                    public final void LJFF(String str) {
                        this.LIZ.storeString("tutorial_video_button", str);
                    }
                };
                concurrentHashMap2.put(cls, interfaceC19252710Tt);
                return interfaceC19252710Tt;
            }
            if (InterfaceC1906120zha.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) C1944007jS.LIZ;
                Object obj3 = concurrentHashMap3.get(cls);
                if (obj3 != null && (obj3 instanceof C1906110zhZ)) {
                    return obj3;
                }
                InterfaceC1906120zha interfaceC1906120zha = new InterfaceC1906120zha(contextN3) { // from class: X.0zhZ
                    {
                        C810670Vr7.LIZJ(contextN3, 0, "IMPreferences");
                    }
                };
                concurrentHashMap3.put(cls, interfaceC1906120zha);
                return interfaceC1906120zha;
            }
            return null;
        }
        return null;
    }
}
