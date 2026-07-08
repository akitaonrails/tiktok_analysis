package X;

import Y.ARunnableS101S0200000_32;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18UQ implements C09KU {
    public final C18UJ LIZ;
    public final C18UZ LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(128));

    @Override // X.C0YTK
    public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
    }

    @Override // X.C0YTY
    public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
    }

    @Override // X.C0YTK
    public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
    }

    public final C18UT LJIIIZ() {
        return (C18UT) this.LJ.getValue();
    }

    @Override // X.C09KU
    public final void LJIIIIZZ(String str) {
        Long lLIZJ;
        C18UT c18utLJIIIZ = LJIIIZ();
        if (c18utLJIIIZ != null) {
            c18utLJIIIZ.LIZIZ(str);
        }
        C18UV c18uv = C18UV.UPLOAD_PHOTO;
        C18UT c18utLJIIIZ2 = LJIIIZ();
        if (c18utLJIIIZ2 != null) {
            lLIZJ = c18utLJIIIZ2.LIZJ(str);
        } else {
            lLIZJ = null;
        }
        LJIIJ(false, c18uv, true, null, lLIZJ);
    }

    @Override // X.C09KU
    public final void LIZ(long j, String str) {
        if ((C21138217no.LIZ() & 4) != 0) {
            C18UT c18utLJIIIZ = LJIIIZ();
            if (c18utLJIIIZ != null) {
                c18utLJIIIZ.LIZIZ = C18UV.UPLOAD_PHOTO;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStartUploadPhoto: ");
                sbLIZ.append(str);
                C21290818Tq.LIZJ("AiChatSendMessageStageTracker", C2188811AlT.LIZIZ(sbLIZ));
                c18utLJIIIZ.LIZJ.put(str, Long.valueOf(SystemClock.uptimeMillis()));
            }
            LJIIJ(true, C18UV.UPLOAD_PHOTO, true, null, null);
        }
    }

    @Override // X.C0YTK
    public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        String str;
        String str2;
        Long lLIZ;
        Long lLIZ2;
        Long lLIZJ;
        Long lLIZ3;
        Long lLIZ4;
        Long lValueOf;
        Long lLIZ5;
        InterfaceC2454409ja cache;
        String str3;
        C18UT c18utLJIIIZ = LJIIIZ();
        if (c18utLJIIIZ != null) {
            C21290818Tq.LIZJ("AiChatSendMessageStageTracker", "onEndSendMessage");
            c18utLJIIIZ.LJII = Long.valueOf(SystemClock.uptimeMillis());
        }
        int size = this.LIZIZ.LJFF.size();
        Map<String, String> map = this.LIZIZ.LIZLLL;
        String str4 = "";
        if (map == null || (str = map.get("prompt_type")) == null) {
            str = "";
        }
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = this.LIZ;
        Map<String, String> map2 = this.LIZIZ.LIZLLL;
        if (map2 != null && (str3 = map2.get("preload_image_status")) != null) {
            str4 = str3;
        }
        List<C21295818Vo> list = this.LIZIZ.LJFF;
        c18up.getClass();
        String strLIZLLL = C18UP.LIZLLL(list);
        Map<String, String> map3 = this.LIZIZ.LIZLLL;
        if (map3 != null) {
            str2 = map3.get("client_task_id");
        } else {
            str2 = null;
        }
        C18UT c18utLJIIIZ2 = LJIIIZ();
        if (c18utLJIIIZ2 != null) {
            lLIZ = C18UT.LIZ(Long.valueOf(c18utLJIIIZ2.LIZ), c18utLJIIIZ2.LJII);
        } else {
            lLIZ = null;
        }
        C18UT c18utLJIIIZ3 = LJIIIZ();
        if (c18utLJIIIZ3 != null) {
            lLIZ2 = C18UT.LIZ(c18utLJIIIZ3.LJFF, c18utLJIIIZ3.LJ);
        } else {
            lLIZ2 = null;
        }
        C18UT c18utLJIIIZ4 = LJIIIZ();
        if (c18utLJIIIZ4 != null) {
            lLIZJ = c18utLJIIIZ4.LIZJ(null);
        } else {
            lLIZJ = null;
        }
        C18UT c18utLJIIIZ5 = LJIIIZ();
        if (c18utLJIIIZ5 != null) {
            lLIZ3 = C18UT.LIZ(c18utLJIIIZ5.LJI, c18utLJIIIZ5.LJII);
        } else {
            lLIZ3 = null;
        }
        C18UT c18utLJIIIZ6 = LJIIIZ();
        if (c18utLJIIIZ6 != null) {
            lLIZ4 = C18UT.LIZ(Long.valueOf(c18utLJIIIZ6.LIZ), c18utLJIIIZ6.LJFF);
        } else {
            lLIZ4 = null;
        }
        C18UP.LJIIJ(c18uj, str, size, true, null, CardStruct.IStatusCode.DEFAULT, str4, strLIZLLL, str2, lLIZ, lLIZ2, lLIZJ, lLIZ3, lLIZ4);
        C18T2 c18t2 = C18T2.LIZ;
        C18UZ c18uz = this.LIZIZ;
        String str5 = c18uz.LIZ;
        boolean z = true;
        boolean z2 = !c18uz.LJFF.isEmpty();
        if (this.LIZIZ.LIZIZ == null) {
            z = false;
        }
        c18t2.getClass();
        HashMap<String, C18T3> map4 = C18T2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_chat_message_send_duration");
        sbLIZ.append(str5);
        C18T3 c18t3 = map4.get(C2188811AlT.LIZIZ(sbLIZ));
        if (c18t3 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c18t3.LIZIZ = jCurrentTimeMillis;
            if (jCurrentTimeMillis - c18t3.LIZ >= 0) {
                C0LAB c0labLIZJ = C18T2.LIZJ();
                c0labLIZJ.LIZIZ(c18t3.LIZIZ - c18t3.LIZ, "duration");
                c0labLIZJ.LJFF("has_image", z2);
                c0labLIZJ.LJFF("has_text", z);
                C20684815ws.LJIILLIIL("ai_chat_message_send_duration", c0labLIZJ.LIZ);
            }
        }
        C18UJ c18uj2 = this.LIZ;
        if (c869590Y9l != null) {
            lValueOf = Long.valueOf(c869590Y9l.getMsgId());
        } else {
            lValueOf = null;
        }
        C21289818Tg.LIZ(lValueOf, "generate_start", new ARunnableS101S0200000_32(c869590Y9l, c18uj2, 19));
        for (C21295818Vo c21295818Vo : this.LIZIZ.LJFF) {
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (cache = iAiChatFeatureService.getCache()) != null) {
                cache.LIZ(c21295818Vo.LIZIZ);
            }
        }
        C18UV c18uv = C18UV.SEND_TO_SERVER;
        C18UT c18utLJIIIZ7 = LJIIIZ();
        if (c18utLJIIIZ7 != null) {
            lLIZ5 = C18UT.LIZ(c18utLJIIIZ7.LJI, c18utLJIIIZ7.LJII);
        } else {
            lLIZ5 = null;
        }
        LJIIJ(false, c18uv, true, null, lLIZ5);
    }

    @Override // X.C0YTY
    public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        Long lLIZ;
        C18UT c18utLJIIIZ = LJIIIZ();
        if (c18utLJIIIZ != null) {
            C21290818Tq.LIZJ("AiChatSendMessageStageTracker", "onEndSaveDb");
            c18utLJIIIZ.LJ = Long.valueOf(SystemClock.uptimeMillis());
        }
        C18UV c18uv = C18UV.SAVE_DB;
        C18UT c18utLJIIIZ2 = LJIIIZ();
        if (c18utLJIIIZ2 != null) {
            lLIZ = C18UT.LIZ(c18utLJIIIZ2.LJFF, c18utLJIIIZ2.LJ);
        } else {
            lLIZ = null;
        }
        LJIIJ(false, c18uv, true, null, lLIZ);
    }

    @Override // X.C09KU
    public final void LJFF(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPhotoUploadFailed: errorMsg = ");
        sbLIZ.append(str2);
        sbLIZ.append(", code=");
        sbLIZ.append(i);
        Long lLIZJ = null;
        C21290818Tq.LIZIZ("SendMessageCallback", C2188811AlT.LIZIZ(sbLIZ), null);
        C18UT c18utLJIIIZ = LJIIIZ();
        if (c18utLJIIIZ != null) {
            c18utLJIIIZ.LIZIZ(str);
        }
        C18UV c18uv = C18UV.UPLOAD_PHOTO;
        C18UT c18utLJIIIZ2 = LJIIIZ();
        if (c18utLJIIIZ2 != null) {
            lLIZJ = c18utLJIIIZ2.LIZJ(str);
        }
        LJIIJ(false, c18uv, false, Integer.valueOf(i), lLIZJ);
    }

    @Override // X.C0YTK
    public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
        String str;
        String string;
        String value;
        String str2;
        Long lLIZ;
        Long lLIZ2;
        Long lLIZJ;
        Long lLIZ3;
        Long lLIZ4;
        String uuid;
        Long lValueOf;
        C18UV c18uv;
        Integer numValueOf;
        InterfaceC2454409ja cache;
        String str3;
        C18UV c18uv2;
        int size = this.LIZIZ.LJFF.size();
        Map<String, String> map = this.LIZIZ.LIZLLL;
        String str4 = "";
        if (map == null || (str = map.get("prompt_type")) == null) {
            str = "";
        }
        C18UT c18utLJIIIZ = LJIIIZ();
        if (c18utLJIIIZ != null) {
            C21290818Tq.LIZJ("AiChatSendMessageStageTracker", "onEndSendMessage");
            c18utLJIIIZ.LJII = Long.valueOf(SystemClock.uptimeMillis());
        }
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = this.LIZ;
        if (c0ymw == null || (string = Integer.valueOf(c0ymw.getCode()).toString()) == null) {
            string = "unknown";
        }
        C18UT c18utLJIIIZ2 = LJIIIZ();
        Long lLIZ5 = null;
        if (c18utLJIIIZ2 != null && (c18uv2 = c18utLJIIIZ2.LIZIZ) != null) {
            value = c18uv2.getValue();
        } else {
            value = null;
        }
        Map<String, String> map2 = this.LIZIZ.LIZLLL;
        if (map2 != null && (str3 = map2.get("preload_image_status")) != null) {
            str4 = str3;
        }
        List<C21295818Vo> list = this.LIZIZ.LJFF;
        c18up.getClass();
        String strLIZLLL = C18UP.LIZLLL(list);
        Map<String, String> map3 = this.LIZIZ.LIZLLL;
        if (map3 != null) {
            str2 = map3.get("client_task_id");
        } else {
            str2 = null;
        }
        C18UT c18utLJIIIZ3 = LJIIIZ();
        if (c18utLJIIIZ3 != null) {
            lLIZ = C18UT.LIZ(Long.valueOf(c18utLJIIIZ3.LIZ), c18utLJIIIZ3.LJII);
        } else {
            lLIZ = null;
        }
        C18UT c18utLJIIIZ4 = LJIIIZ();
        if (c18utLJIIIZ4 != null) {
            lLIZ2 = C18UT.LIZ(c18utLJIIIZ4.LJFF, c18utLJIIIZ4.LJ);
        } else {
            lLIZ2 = null;
        }
        C18UT c18utLJIIIZ5 = LJIIIZ();
        if (c18utLJIIIZ5 != null) {
            lLIZJ = c18utLJIIIZ5.LIZJ(null);
        } else {
            lLIZJ = null;
        }
        C18UT c18utLJIIIZ6 = LJIIIZ();
        if (c18utLJIIIZ6 != null) {
            lLIZ3 = C18UT.LIZ(c18utLJIIIZ6.LJI, c18utLJIIIZ6.LJII);
        } else {
            lLIZ3 = null;
        }
        C18UT c18utLJIIIZ7 = LJIIIZ();
        if (c18utLJIIIZ7 != null) {
            lLIZ4 = C18UT.LIZ(Long.valueOf(c18utLJIIIZ7.LIZ), c18utLJIIIZ7.LJFF);
        } else {
            lLIZ4 = null;
        }
        boolean z = false;
        C18UP.LJIIJ(c18uj, str, size, false, value, string, str4, strLIZLLL, str2, lLIZ, lLIZ2, lLIZJ, lLIZ3, lLIZ4);
        for (C21295818Vo c21295818Vo : this.LIZIZ.LJFF) {
            boolean z2 = z;
            z = z;
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, z2, z, z, 14, null);
            if (iAiChatFeatureService != null && (cache = iAiChatFeatureService.getCache()) != null) {
                cache.LIZJ(c21295818Vo.LIZIZ);
            }
        }
        StringBuilder sb = new StringBuilder("onSendFailed: id=");
        if (c869590Y9l != null) {
            uuid = c869590Y9l.getUuid();
        } else {
            uuid = null;
        }
        sb.append(uuid);
        sb.append(", serverid=");
        if (c869590Y9l != null) {
            lValueOf = Long.valueOf(c869590Y9l.getMsgId());
        } else {
            lValueOf = null;
        }
        sb.append(lValueOf);
        sb.append(", error= ");
        sb.append(c0ymw);
        C21290818Tq.LIZIZ("SendMessageCallback", sb.toString(), null);
        C18UT c18utLJIIIZ8 = LJIIIZ();
        if (c18utLJIIIZ8 != null) {
            c18uv = c18utLJIIIZ8.LIZIZ;
        } else {
            c18uv = null;
        }
        if (c18uv == C18UV.SEND_TO_SERVER || c18uv == C18UV.SAVE_DB) {
            if (c0ymw != null) {
                numValueOf = Integer.valueOf(c0ymw.getCode());
            } else {
                numValueOf = null;
            }
            C18UT c18utLJIIIZ9 = LJIIIZ();
            if (c18utLJIIIZ9 != null) {
                int i = C18UX.LIZ[c18utLJIIIZ9.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                lLIZ5 = c18utLJIIIZ9.LIZJ(null);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            lLIZ5 = C18UT.LIZ(c18utLJIIIZ9.LJI, c18utLJIIIZ9.LJII);
                        }
                    } else {
                        lLIZ5 = C18UT.LIZ(Long.valueOf(c18utLJIIIZ9.LIZ), c18utLJIIIZ9.LJFF);
                    }
                } else {
                    lLIZ5 = C18UT.LIZ(c18utLJIIIZ9.LJFF, c18utLJIIIZ9.LJ);
                }
            }
            LJIIJ(z, c18uv, z, numValueOf, lLIZ5);
        }
    }

    public C18UQ(C18UJ c18uj, C18UZ c18uz, boolean z, String str) {
        this.LIZ = c18uj;
        this.LIZIZ = c18uz;
        this.LIZJ = z;
        this.LIZLLL = str;
    }

    public final void LJIIJ(boolean z, C18UV c18uv, boolean z2, Integer num, Long l) {
        String string;
        String str;
        C0D8I c0d8i;
        C18UP c18up = C18UP.LIZ;
        int size = this.LIZIZ.LJFF.size();
        String string2 = this.LIZLLL;
        boolean z3 = this.LIZJ;
        String value = c18uv.getValue();
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        Integer numValueOf = Integer.valueOf(size);
        c18up.getClass();
        if ((C21138217no.LIZ() & 4) != 0) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJFF("is_retry", z3);
            String str2 = "start";
            if (z) {
                str = "start";
            } else {
                str = "end";
            }
            c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            c0lab.LJ("stage_name", value);
            if (l != null) {
                l.longValue();
                c0lab.LJ("duration", l.toString());
            }
            if (string2 != null) {
                c0lab.LJ("client_task_id", string2);
            }
            if (string != null) {
                c0lab.LJ("error_code", string);
            }
            if (numValueOf != null) {
                numValueOf.intValue();
                c0lab.LIZ(numValueOf.intValue(), "pic_cnt");
            }
            c0lab.LJFF("success", z2);
            C20684815ws.LJIILLIIL("vp_performance_send", c0lab.LIZ);
            if (C255970A1j.LIZ()) {
                if (string2 == null) {
                    string2 = UUID.randomUUID().toString();
                }
                if (z2) {
                    c0d8i = C0D8I.INFO;
                } else {
                    c0d8i = C0D8I.ERROR;
                }
                C0CTD c0ctd = C0CTD.LIZ;
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("client_task_id", string2), new Pair("is_retry", String.valueOf(z3)), new Pair("time", String.valueOf(System.currentTimeMillis())));
                if (!z) {
                    str2 = "end";
                }
                mapLJIIJ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
                mapLJIIJ.put("stage_name", value);
                if (l != null) {
                    l.longValue();
                    mapLJIIJ.put("duration", l.toString());
                }
                if (string != null) {
                    mapLJIIJ.put("error_code", string);
                }
                if (numValueOf != null) {
                    numValueOf.intValue();
                    mapLJIIJ.put("pic_cnt", numValueOf.toString());
                }
                mapLJIIJ.put("success", String.valueOf(z2));
                C0CTD.LIZIZ(string2, "vp_performance_send", c0d8i, mapLJIIJ);
            }
        }
    }
}
