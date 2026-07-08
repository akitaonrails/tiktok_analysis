package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionTranslateWidget;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS153S1100000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346570DiJ extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346570DiJ(C0CIJ c0cij, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0cij;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346570DiJ(C19719212De c19719212De, int i) {
        super(4);
        this.$t = i;
        this.l0 = c19719212De;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346570DiJ(CaptionTranslateWidget captionTranslateWidget, int i) {
        super(4);
        this.$t = i;
        this.l0 = captionTranslateWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346570DiJ(EffectDraftDetailAssem effectDraftDetailAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = effectDraftDetailAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346570DiJ(ProfileIdentifierFragment profileIdentifierFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = profileIdentifierFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346570DiJ(List list, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
    }

    public static final Object invoke$0(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        long jLongValue3 = ((Number) obj3).longValue();
        long jLongValue4 = ((Number) obj4).longValue();
        C0DT4 c0dt4 = ((CaptionTranslateWidget) c346570DiJ.l0).LLJLILLLLZIIL;
        if (c0dt4 != null) {
            c0dt4.LIZLLL(jLongValue, jLongValue2, jLongValue3, jLongValue4, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(Intrinsics.LJFF(((C0CIJ) c346570DiJ.l0).addFeatureCode((VideoPublishEditModel) obj, (NLEModel) obj2, (NLETrack) obj3, (NLETrackSlot) obj4), Boolean.TRUE));
    }

    public static final Object invoke$2(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        String strLJIIJ;
        String str;
        int i;
        C322460CkW c322460CkW;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        EnumC322330CkJ enumC322330CkJ = (EnumC322330CkJ) obj3;
        EnumC322300CkG enumC322300CkG = (EnumC322300CkG) obj4;
        final List<? extends Object> list = ((C322450CkV) obj2).LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChanged, ");
        sbLIZ.append(enumC322330CkJ);
        sbLIZ.append(", ");
        sbLIZ.append(list);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectDraftDetailAssem", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = C322340CkK.LIZ[enumC322330CkJ.ordinal()];
        String strLIZIZ = "";
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ((EffectDraftDetailAssem) c346570DiJ.l0).lp();
                    ((EffectDraftDetailAssem) c346570DiJ.l0).mp();
                } else {
                    throw new C1954807lC();
                }
            } else if (list.isEmpty()) {
                C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
                if (c19egLIZ != null) {
                    c19egLIZ.finish();
                }
            } else {
                ((EffectDraftDetailAssem) c346570DiJ.l0).lp();
                ((EffectDraftDetailAssem) c346570DiJ.l0).mp();
                if (((AbstractC21673619ry) ((EffectDraftDetailAssem) c346570DiJ.l0).LLJJIJI.getValue()).getItemCount() == 0) {
                    EffectDraftDetailAssem effectDraftDetailAssem = (EffectDraftDetailAssem) c346570DiJ.l0;
                    effectDraftDetailAssem.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("");
                    sbLIZ2.append(effectDraftDetailAssem.hp().getState().LLILLL.LIZ.size());
                    linkedHashMap.put("effect_draft_cnt", C2188811AlT.LIZIZ(sbLIZ2));
                    C1737910vKH.LIZ("prop_draft_page_show", linkedHashMap);
                }
                C337170DJr c337170DJr = (C337170DJr) ((EffectDraftDetailAssem) c346570DiJ.l0).LLJJIJI.getValue();
                final List<? extends Object> list2 = c337170DJr.LLILLJJLI;
                C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0DG2
                    @Override // X.AbstractC21342018fa
                    public final int LIZLLL() {
                        return list.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final int LJ() {
                        return list2.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZ(int i3, int i4) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i3, list2);
                        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i4, list);
                        if ((objLJJJLZIJ instanceof C322460CkW) && (objLJJJLZIJ2 instanceof C322460CkW)) {
                            return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
                        }
                        return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZIZ(int i3, int i4) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i3, list2);
                        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i4, list);
                        if ((objLJJJLZIJ instanceof C322460CkW) && (objLJJJLZIJ2 instanceof C322460CkW)) {
                            return Intrinsics.LJFF(((C322460CkW) objLJJJLZIJ).LIZLLL, ((C322460CkW) objLJJJLZIJ2).LIZLLL);
                        }
                        return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
                    }

                    @Override // X.AbstractC21342018fa
                    public final Object LIZJ(int i3, int i4) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i3, list2);
                        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i4, list);
                        if ((objLJJJLZIJ instanceof C322460CkW) && (objLJJJLZIJ2 instanceof C322460CkW)) {
                            return "payload_EffectDraftDetailCardData";
                        }
                        return null;
                    }
                }, true);
                c337170DJr.LLILLJJLI = list;
                c21341918fZLIZ.LIZJ(c337170DJr);
            }
        } else {
            EffectDraftDetailAssem effectDraftDetailAssem2 = (EffectDraftDetailAssem) c346570DiJ.l0;
            effectDraftDetailAssem2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : list) {
                AbstractC322270CkD abstractC322270CkD = null;
                if ((obj5 instanceof C322460CkW) && (c322460CkW = (C322460CkW) obj5) != null) {
                    abstractC322270CkD = c322460CkW.LIZJ;
                }
                if (abstractC322270CkD instanceof C322280CkE) {
                    arrayList.add(obj5);
                }
            }
            int size = arrayList.size();
            ViewGroup viewGroup = effectDraftDetailAssem2.LLJJJIL;
            if (viewGroup != null) {
                if (size == 0) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LJLZ(i, viewGroup);
            }
            TuxTextView tuxTextView = effectDraftDetailAssem2.LLJJJJ;
            if (tuxTextView != null) {
                Context context = effectDraftDetailAssem2.getContext();
                if (context != null) {
                    String string = context.getString(2131820916);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(string);
                    sbLIZ3.append('(');
                    sbLIZ3.append(size);
                    sbLIZ3.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                tuxTextView.setText(strLIZIZ);
            }
            EffectDraftDetailAssem effectDraftDetailAssem3 = (EffectDraftDetailAssem) c346570DiJ.l0;
            TuxNavBar tuxNavBar = effectDraftDetailAssem3.LLJJJ;
            if (tuxNavBar != null) {
                int i3 = C322350CkL.LIZ[enumC322300CkG.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        strLJIIJ = C1383370m6R.LJIIJ(2131820919);
                        str = "deselect_all";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    strLJIIJ = C1383370m6R.LJIIJ(2131847260);
                    str = "select_all";
                }
                C1250300ido c1250300ido = new C1250300ido();
                c1250300ido.LIZJ = strLJIIJ;
                c1250300ido.LJ = true;
                EnumC638250P1r enumC638250P1r = EnumC638250P1r.SECONDARY;
                c1250300ido.LIZLLL = enumC638250P1r;
                c1250300ido.LIZ(new AwS153S1100000_4(effectDraftDetailAssem3, str, 7));
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = C1383370m6R.LJIIJ(2131820921);
                C1250300ido c1250300ido2 = new C1250300ido();
                c1250300ido2.LIZJ = C1383370m6R.LJIIJ(2131820914);
                c1250300ido2.LJ = true;
                c1250300ido2.LIZLLL = enumC638250P1r;
                c1250300ido2.LIZ(new AwS548S0100000_4(effectDraftDetailAssem3, 470));
                C0OM1 c0om1 = new C0OM1();
                c0om1.LJ(c1250300ido);
                c0om1.LIZJ = c1250250idj;
                c0om1.LIZIZ(c1250300ido2);
                tuxNavBar.setNavActions(c0om1);
            }
            C337170DJr c337170DJr2 = (C337170DJr) ((EffectDraftDetailAssem) c346570DiJ.l0).LLJJIJI.getValue();
            final List<? extends Object> list3 = c337170DJr2.LLILLJJLI;
            C21341918fZ c21341918fZLIZ2 = C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0DG2
                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return list.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return list3.size();
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i32, int i4) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i32, list3);
                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i4, list);
                    if ((objLJJJLZIJ instanceof C322460CkW) && (objLJJJLZIJ2 instanceof C322460CkW)) {
                        return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
                    }
                    return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i32, int i4) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i32, list3);
                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i4, list);
                    if ((objLJJJLZIJ instanceof C322460CkW) && (objLJJJLZIJ2 instanceof C322460CkW)) {
                        return Intrinsics.LJFF(((C322460CkW) objLJJJLZIJ).LIZLLL, ((C322460CkW) objLJJJLZIJ2).LIZLLL);
                    }
                    return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
                }

                @Override // X.AbstractC21342018fa
                public final Object LIZJ(int i32, int i4) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i32, list3);
                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i4, list);
                    if ((objLJJJLZIJ instanceof C322460CkW) && (objLJJJLZIJ2 instanceof C322460CkW)) {
                        return "payload_EffectDraftDetailCardData";
                    }
                    return null;
                }
            }, true);
            c337170DJr2.LLILLJJLI = list;
            c21341918fZLIZ2.LIZJ(c337170DJr2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 131) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            ((InterfaceC1631620sYq) c346570DiJ.l0).invoke(obj, interfaceC1680500tpg, Integer.valueOf(iIntValue & 14));
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 131) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            ((InterfaceC1631620sYq) c346570DiJ.l0).invoke(obj, interfaceC1680500tpg, Integer.valueOf(iIntValue & 14));
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:4:0x001f, B:10:0x0031, B:12:0x0036, B:14:0x0041, B:15:0x0045, B:17:0x0049, B:19:0x004d, B:27:0x0079, B:29:0x007d, B:31:0x0083, B:39:0x009f, B:40:0x00a2, B:36:0x0094, B:38:0x0098, B:21:0x0056, B:23:0x005a, B:25:0x0074, B:7:0x0026), top: B:45:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(X.C346570DiJ r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r2 = r5.intValue()
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            java.lang.Object r4 = r3.l0
            com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment r4 = (com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment) r4
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto Lb2
            int r3 = r4.LLJI     // Catch: java.lang.Throwable -> La5
            r6 = 255(0xff, float:3.57E-43)
            if (r2 < r3) goto L26
            goto L2d
        L26:
            float r1 = (float) r2     // Catch: java.lang.Throwable -> La5
            float r0 = (float) r3     // Catch: java.lang.Throwable -> La5
            float r1 = r1 / r0
            float r0 = (float) r6     // Catch: java.lang.Throwable -> La5
            float r1 = r1 * r0
            int r5 = (int) r1     // Catch: java.lang.Throwable -> La5
            goto L2f
        L2d:
            r5 = 255(0xff, float:3.57E-43)
        L2f:
            if (r2 <= r3) goto L5a
            com.bytedance.tux.navigation.TuxNavBar r3 = r4.LLILZLL     // Catch: java.lang.Throwable -> La5
            r1 = 0
            if (r3 == 0) goto L45
            r0 = 2131382560(0x7f0a5120, float:1.8385469E38)
            android.view.View r0 = r3.findViewById(r0)     // Catch: java.lang.Throwable -> La5
            X.1CRB r0 = (X.C1CRB) r0     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L45
            android.graphics.drawable.Drawable r1 = r0.getBackground()     // Catch: java.lang.Throwable -> La5
        L45:
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L56
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L56
            int r0 = r1.getColor()     // Catch: java.lang.Throwable -> La5
            int r0 = r0 >> 24
            r0 = r0 & r6
            if (r0 >= r6) goto L77
        L56:
            int r0 = r4.LLJI     // Catch: java.lang.Throwable -> La5
            if (r2 <= r0) goto L77
        L5a:
            int r0 = r4.LLIZ     // Catch: java.lang.Throwable -> La5
            int r3 = android.graphics.Color.red(r0)     // Catch: java.lang.Throwable -> La5
            int r0 = r4.LLIZ     // Catch: java.lang.Throwable -> La5
            int r1 = android.graphics.Color.green(r0)     // Catch: java.lang.Throwable -> La5
            int r0 = r4.LLIZ     // Catch: java.lang.Throwable -> La5
            int r0 = android.graphics.Color.blue(r0)     // Catch: java.lang.Throwable -> La5
            int r1 = android.graphics.Color.argb(r5, r3, r1, r0)     // Catch: java.lang.Throwable -> La5
            com.bytedance.tux.navigation.TuxNavBar r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L77
            r0.setNavBackground(r1)     // Catch: java.lang.Throwable -> La5
        L77:
            if (r2 <= 0) goto L92
            int r0 = r4.LLJIJIL     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto La2
            X.19EG r0 = r4.getActivity()     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L8e
            boolean r1 = X.C960203pA.LIZIZ(r0)     // Catch: java.lang.Throwable -> La5
            r0 = 1
            if (r1 != r0) goto L8e
            r0 = 2131100554(0x7f06038a, float:1.7813493E38)
            goto L9f
        L8e:
            r0 = 2131100553(0x7f060389, float:1.781349E38)
            goto L9f
        L92:
            if (r2 != 0) goto La2
            int r0 = r4.LLJIJIL     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto La2
            r0 = 2131100556(0x7f06038c, float:1.7813497E38)
            r4.NR(r0)     // Catch: java.lang.Throwable -> La5
            goto La2
        L9f:
            r4.NR(r0)     // Catch: java.lang.Throwable -> La5
        La2:
            r4.LLJIJIL = r2     // Catch: java.lang.Throwable -> La5
            goto Lb2
        La5:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "ProfileIdentifierPage"
            java.lang.String r0 = "handleNavbarAlpha error:"
            X.C1720106oR.LIZIZ(r1, r0, r2)
        Lb2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346570DiJ.invoke$5(X.0DiJ, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            Pair pair = (Pair) ListProtector.get((List) c346570DiJ.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(-1265810558);
            ((Function2) pair.getSecond()).invoke(interfaceC1680500tpg, 0);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            Function2 function2 = (Function2) ListProtector.get((List) c346570DiJ.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(1351161817);
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(((i & 14) >> 3) & 14));
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            Function2 function2 = (Function2) ListProtector.get((List) c346570DiJ.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(-126755320);
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(((i & 14) >> 3) & 14));
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(C346570DiJ c346570DiJ, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            Function2 function2 = (Function2) ListProtector.get((List) c346570DiJ.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(1112229088);
            function2.invoke(interfaceC1680500tpg, Integer.valueOf(((i & 14) >> 3) & 14));
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }
}
