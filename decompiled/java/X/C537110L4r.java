package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS657S0100000_8;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0L4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537110L4r {
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0L4t] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0L1L] */
    public static final BackgroundVideoStickerPresenter LIZ(C19EG c19eg, InterfaceC524950KiL interfaceC524950KiL, final ShortVideoContext shortVideoContext, final Function0 function0, InterfaceC21361218ig interfaceC21361218ig, C1621630sIj c1621630sIj, InterfaceC540220LGq interfaceC540220LGq, LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, boolean z, C21358618iG c21358618iG, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, Function2 function2) {
        String creationId = shortVideoContext.getCreationId();
        ?? r13 = new InterfaceC1456340o08() { // from class: X.0L4t
            @Override // X.InterfaceC1456340o08
            public final /* synthetic */ Object get() {
                return function0.invoke();
            }
        };
        ?? r15 = new InterfaceC21358218iC(shortVideoContext) { // from class: X.0L1L
            public final ShortVideoContext LIZ;

            {
                this.LIZ = shortVideoContext;
            }

            @Override // X.InterfaceC21358218iC
            public final void LJ(Effect effect) {
                String resourceId;
                String effectId;
                C528230Knd c528230KndLJ = C534690Ky3.LJ(this.LIZ);
                c528230KndLJ.LJI = C0L9O.VIDEO_SHOOT_PAGE.getValue();
                c528230KndLJ.LJII = EnumC538190L8v.PROP_UPLOAD.getValue();
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", c528230KndLJ.LIZIZ);
                c0lab.LJ("shoot_way", c528230KndLJ.LIZ);
                c0lab.LJ("album_from_page", c528230KndLJ.LJI);
                c0lab.LJ("album_from_scene", c528230KndLJ.LJII);
                c0lab.LJ("shoot_enter_method", c528230KndLJ.LIZLLL);
                c0lab.LJ("shoot_enter_from", c528230KndLJ.LIZJ);
                c0lab.LJ("shoot_tab_name", this.LIZ.LJIJJLI());
                Integer numValueOf = null;
                if (effect != null) {
                    resourceId = effect.getResourceId();
                } else {
                    resourceId = null;
                }
                c0lab.LJ("prop_resource_id", resourceId);
                if (effect != null) {
                    effectId = effect.getEffectId();
                } else {
                    effectId = null;
                }
                c0lab.LJ("prop_id", effectId);
                if (effect != null) {
                    numValueOf = Integer.valueOf(effect.getSource());
                }
                c0lab.LJ("effect_source", String.valueOf(numValueOf));
                if (effect != null) {
                    C0LXN.LIZ.getClass();
                    C0LXN.LIZIZ(c0lab, effect);
                }
                C2341909Fp.LIZ("click_upload_entrance", c0lab.LIZ);
            }

            @Override // X.InterfaceC21358218iC
            public final void LIZIZ(Effect effect, String str, String str2) {
                ShortVideoContext shortVideoContext2 = this.LIZ;
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("video_source", "upload");
                if (str == null) {
                    str = "";
                }
                pairArr[1] = new Pair("tab_name", str);
                pairArr[2] = new Pair("prop_id", effect.getEffectId());
                pairArr[3] = new Pair("click_content", str2);
                C1449260noi.LJ("prop_customized_complete", C1449260noi.LIZ(shortVideoContext2, pairArr));
            }

            @Override // X.InterfaceC21358218iC
            public final void LIZJ(int i, String str, String str2, String str3, String str4) {
                String str5;
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("prop_id", str);
                c0lab.LJ("resource_id", str2);
                c0lab.LJ("enter_from", str4);
                ShortVideoContext shortVideoContext2 = this.LIZ;
                if (shortVideoContext2 == null || (str5 = shortVideoContext2.shootWay) == null) {
                    str5 = "";
                }
                c0lab.LJ("shoot_way", str5);
                c0lab.LIZ(i, "video_cnt");
                c0lab.LJ("folded_status", str3);
                C20684815ws.LJIILLIIL("upload_picker_status_change", c0lab.LIZ);
            }

            @Override // X.InterfaceC21358218iC
            public final void LIZLLL(Effect effect, String str, String str2, String str3, int i) {
                String str4 = "";
                if (ChangeImagePickerUIExperiment.isEnabled()) {
                    ShortVideoContext shortVideoContext2 = this.LIZ;
                    Pair[] pairArr = new Pair[9];
                    pairArr[0] = new Pair("video_source", "upload");
                    if (str != null) {
                        str4 = str;
                    }
                    pairArr[1] = new Pair("tab_name", str4);
                    pairArr[2] = new Pair("prop_id", effect.getEffectId());
                    pairArr[3] = new Pair("click_content", str2);
                    pairArr[4] = new Pair("content_type", "video");
                    pairArr[5] = new Pair("video_cnt", str3);
                    pairArr[6] = new Pair("selected_index", String.valueOf(i));
                    pairArr[7] = new Pair("prop_resource_id", effect.getResourceId());
                    pairArr[8] = new Pair("effect_source", String.valueOf(effect.getSource()));
                    HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext2, pairArr);
                    C0LXN.LIZ.getClass();
                    C0LXN.LIZ(effect, mapLIZ);
                    C1449260noi.LJ("prop_customized_click", mapLIZ);
                    return;
                }
                if (C522610KeZ.LIZ()) {
                    ShortVideoContext shortVideoContext3 = this.LIZ;
                    Pair[] pairArr2 = new Pair[9];
                    pairArr2[0] = new Pair("video_source", "upload");
                    if (str != null) {
                        str4 = str;
                    }
                    pairArr2[1] = new Pair("tab_name", str4);
                    pairArr2[2] = new Pair("prop_id", effect.getEffectId());
                    pairArr2[3] = new Pair("click_content", str2);
                    pairArr2[4] = new Pair("content_type", "video");
                    pairArr2[5] = new Pair("video_cnt", str3);
                    pairArr2[6] = new Pair("selected_index", String.valueOf(i));
                    pairArr2[7] = new Pair("prop_resource_id", effect.getResourceId());
                    pairArr2[8] = new Pair("effect_source", String.valueOf(effect.getSource()));
                    HashMap<String, String> mapLIZ2 = C1449260noi.LIZ(shortVideoContext3, pairArr2);
                    C0LXN.LIZ.getClass();
                    C0LXN.LIZ(effect, mapLIZ2);
                    C1449260noi.LJ("prop_customized_click", mapLIZ2);
                    return;
                }
                ShortVideoContext shortVideoContext4 = this.LIZ;
                Pair[] pairArr3 = new Pair[6];
                pairArr3[0] = new Pair("video_source", "upload");
                if (str != null) {
                    str4 = str;
                }
                pairArr3[1] = new Pair("tab_name", str4);
                pairArr3[2] = new Pair("prop_id", effect.getEffectId());
                pairArr3[3] = new Pair("click_content", str2);
                pairArr3[4] = new Pair("prop_resource_id", effect.getResourceId());
                pairArr3[5] = new Pair("effect_source", String.valueOf(effect.getSource()));
                HashMap<String, String> mapLIZ3 = C1449260noi.LIZ(shortVideoContext4, pairArr3);
                C0LXN.LIZ.getClass();
                C0LXN.LIZ(effect, mapLIZ3);
                C1449260noi.LJ("prop_customized_click", mapLIZ3);
            }

            @Override // X.InterfaceC21358218iC
            public final void LIZ(String str, String str2, String str3, String str4, int i, boolean z2, boolean z3, int i2, Map<String, String> map) {
                boolean z4;
                String str5 = str2;
                if (str5 != null && str5.length() != 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                String str6 = "";
                if (z4) {
                    str5 = "";
                }
                String str7 = "album";
                String str8 = "photo";
                if (u.LJIJI(str, "VIDEO", false)) {
                    ShortVideoContext shortVideoContext2 = this.LIZ;
                    if (shortVideoContext2 != null) {
                        Pair[] pairArr = new Pair[8];
                        pairArr[0] = new Pair("video_source", "upload");
                        pairArr[1] = new Pair("prop_id", str5);
                        if (!z3) {
                            if (!z2) {
                                str7 = "video";
                            } else {
                                str7 = "multi_video";
                            }
                        }
                        pairArr[2] = new Pair("click_content", str7);
                        pairArr[3] = new Pair("video_cnt", String.valueOf(i));
                        if (!this.LIZ.isStoryOrPhotoTab) {
                            str8 = "video";
                        }
                        pairArr[4] = new Pair("content_type", str8);
                        pairArr[5] = new Pair("effect_source", str4);
                        if (str3 != null) {
                            str6 = str3;
                        }
                        pairArr[6] = new Pair("prop_resource_id", str6);
                        pairArr[7] = new Pair("shoot_tab_name", this.LIZ.LJIJJLI());
                        HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext2, pairArr);
                        if (C522610KeZ.LIZ()) {
                            mapLIZ.put("selected_index", String.valueOf(i2));
                        }
                        mapLIZ.putAll(map);
                        C1449260noi.LJ("prop_customized_click", mapLIZ);
                        return;
                    }
                    return;
                }
                ShortVideoContext shortVideoContext3 = this.LIZ;
                if (shortVideoContext3 == null) {
                    return;
                }
                Pair[] pairArr2 = new Pair[5];
                pairArr2[0] = new Pair("picture_source", "upload");
                pairArr2[1] = new Pair("prop_id", str5);
                if (!z3) {
                    if (!z2) {
                        str7 = "photo";
                    } else {
                        str7 = "multi_photo";
                    }
                }
                pairArr2[2] = new Pair("click_content", str7);
                pairArr2[3] = new Pair("photo_cnt", String.valueOf(i));
                if (!this.LIZ.isStoryOrPhotoTab) {
                    str8 = "video";
                }
                pairArr2[4] = new Pair("content_type", str8);
                HashMap<String, String> mapLIZ2 = C1449260noi.LIZ(shortVideoContext3, pairArr2);
                if (C522610KeZ.LIZ()) {
                    mapLIZ2.put("selected_index", String.valueOf(i2));
                }
                C1449260noi.LJ("prop_customized_click", mapLIZ2);
            }
        };
        C537120L4s c537120L4s = C537120L4s.LL;
        C537080L4o c537080L4o = new C537080L4o(4, shortVideoContext);
        C537070L4n c537070L4n = new C537070L4n(shortVideoContext, interfaceC1624480sNK, new C0L3B(shortVideoContext) { // from class: X.0L39
            {
                super("from_background_video", "background_video_compile_configure", C0L35.LIZ(shortVideoContext.cameraComponentModel.mWorkspace));
            }
        });
        C530070Kqb c530070Kqb = new C530070Kqb(c19eg);
        return new BackgroundVideoStickerPresenter(c19eg, interfaceC1624480sNK, creationId, interfaceC524950KiL, r13, interfaceC21361218ig, r15, c537120L4s, c537080L4o, c537070L4n, c1621630sIj, new C530260Kqu(c530070Kqb), AFwS291S0000000_8.get$arr$(16), interfaceC540220LGq, z, lifecycleOwner, new AwS552S0100000_8(shortVideoContext, 783), new AwS657S0100000_8(shortVideoContext, 7), c21358618iG, new C09I5(C09IB.LIZ), new AwS581S0100000_2(shortVideoContext, 349), function1, interfaceC1631620sYq, function2);
    }
}
