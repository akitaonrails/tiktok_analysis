package X;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import com.ss.android.ugc.aweme.sticker.ab.EffectUploadPickerFolderUIExperiment;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21525019Ls extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21525019Ls(C21357318i3 c21357318i3, int i) {
        super(4);
        this.$t = i;
        this.l0 = c21357318i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21525019Ls(C21357418i4 c21357418i4, int i) {
        super(4);
        this.$t = i;
        this.l0 = c21357418i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21525019Ls(C21360518iZ c21360518iZ, int i) {
        super(4);
        this.$t = i;
        this.l0 = c21360518iZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C21525019Ls c21525019Ls, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj4).booleanValue();
        Message messageObtain = Message.obtain();
        C21356918hz c21356918hz = new C21356918hz((String) obj2);
        c21356918hz.LIZLLL = (String) obj;
        messageObtain.obj = c21356918hz;
        messageObtain.what = 1002;
        UploadPicStickerManager$initHandler$2 uploadPicStickerManager$initHandler$2 = ((C21360518iZ) c21525019Ls.l0).LJII;
        if (uploadPicStickerManager$initHandler$2 != null) {
            C786410Ut5.LJLJJL(uploadPicStickerManager$initHandler$2, messageObtain);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C21525019Ls c21525019Ls, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj4).intValue();
        Message messageObtain = Message.obtain();
        C21356918hz c21356918hz = new C21356918hz((String) obj2, iIntValue);
        c21356918hz.LIZLLL = (String) obj;
        messageObtain.obj = c21356918hz;
        messageObtain.what = 1002;
        UploadPicStickerManager$initHandler$2 uploadPicStickerManager$initHandler$2 = ((C21360518iZ) c21525019Ls.l0).LJII;
        if (uploadPicStickerManager$initHandler$2 != null) {
            C786410Ut5.LJLJJL(uploadPicStickerManager$initHandler$2, messageObtain);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C21525019Ls c21525019Ls, Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC21358118iB interfaceC21358118iB;
        Function0<Unit> function0;
        InterfaceC21358118iB interfaceC21358118iB2;
        String effect_id;
        int i;
        float f;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C21356918hz c21356918hz = (C21356918hz) obj2;
        List<C1621190sI1> list = (List) obj3;
        Map<C21356918hz, Integer> map = (Map) obj4;
        C21357318i3 c21357318i3 = (C21357318i3) c21525019Ls.l0;
        View viewLJJ = c21357318i3.LJJ();
        if (viewLJJ != null) {
            int size = map.size();
            C1624230sMv c1624230sMv = c21357318i3.LJIL;
            if (c1624230sMv != null) {
                i = c1624230sMv.LIZJ;
            } else {
                i = 0;
            }
            if (size >= i) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.T4(viewLJJ, f);
            InterfaceC21358118iB interfaceC21358118iB3 = c21357318i3.LJIILIIL;
            if (interfaceC21358118iB3 != null) {
                interfaceC21358118iB3.LJIIJ(c21356918hz.LIZ, c21356918hz.LIZLLL, "media_tray");
            }
            InterfaceC212356188k interfaceC212356188k = c21357318i3.LJIILJJIL;
            if (interfaceC212356188k != null) {
                interfaceC212356188k.LJ(list, map);
            }
        }
        if (zBooleanValue) {
            C1638280sja c1638280sja = C21366318jV.LIZLLL;
            Activity activity = c21357318i3.LJIIL;
            C1638280sja.LIZLLL(c1638280sja, activity, C786410Ut5.j4(activity.getString(2131830079), Arrays.copyOf(new Object[]{Integer.valueOf(map.size())}, 1))).LIZ();
        }
        String effect_id2 = null;
        if (C522610KeZ.LIZ() && map.keySet().contains(c21356918hz) && (interfaceC21358118iB2 = c21357318i3.LJIILIIL) != null) {
            String string = c21357318i3.LJIILLIIL.toString();
            Effect effect = c21357318i3.LJJIJIL;
            if (effect != null) {
                effect_id = effect.getEffect_id();
            } else {
                effect_id = null;
            }
            interfaceC21358118iB2.LJFF(string, effect_id, list.size(), true, false, c21356918hz.LJIIJ, null);
        }
        if (EffectUploadPickerFolderUIExperiment.isEnabled()) {
            ArrayList<C1621190sI1> arrayListLIZ = C09HN.LIZ(list);
            if (arrayListLIZ != null) {
                c21357318i3.LJJIIZ = arrayListLIZ;
            }
            if ((!list.isEmpty()) && (function0 = c21357318i3.LJIJI) != null) {
                function0.invoke();
            }
            if (map.keySet().contains(c21356918hz) && !C522610KeZ.LIZ() && (interfaceC21358118iB = c21357318i3.LJIILIIL) != null) {
                String string2 = c21357318i3.LJIILLIIL.toString();
                Effect effect2 = c21357318i3.LJJIJIL;
                if (effect2 != null) {
                    effect_id2 = effect2.getEffect_id();
                }
                interfaceC21358118iB.LJFF(string2, effect_id2, list.size(), true, false, c21356918hz.LJIIJ, null);
            }
            C1624230sMv c1624230sMv2 = c21357318i3.LJIL;
            if (c1624230sMv2 != null && map.size() >= c1624230sMv2.LIZLLL) {
                ArrayList arrayList = new ArrayList();
                Iterator<C1621190sI1> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                C21357918i9.LIZJ(arrayList);
                InterfaceC212356188k interfaceC212356188k2 = c21357318i3.LJIILJJIL;
                if (interfaceC212356188k2 != null) {
                    interfaceC212356188k2.LJFF(list);
                }
                c21357318i3.LJIILL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C21525019Ls c21525019Ls, Object obj, Object obj2, Object obj3, Object obj4) {
        Function0<Unit> function0;
        InterfaceC21358118iB interfaceC21358118iB;
        InterfaceC21358118iB interfaceC21358118iB2;
        String effect_id;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C21356918hz c21356918hz = (C21356918hz) obj2;
        List<C1621190sI1> list = (List) obj3;
        Map map = (Map) obj4;
        C21357418i4 c21357418i4 = (C21357418i4) c21525019Ls.l0;
        c21357418i4.LJJ().LIZ().LJFF(c21356918hz, list, map);
        if (zBooleanValue) {
            C1638280sja c1638280sja = C21366318jV.LIZLLL;
            Activity activity = c21357418i4.LJIIJ;
            C1638280sja.LIZLLL(c1638280sja, activity, C786410Ut5.j4(activity.getString(2131830079), Arrays.copyOf(new Object[]{Integer.valueOf(map.size())}, 1))).LIZ();
        }
        String effect_id2 = null;
        if (C522610KeZ.LIZ() && map.keySet().contains(c21356918hz) && (interfaceC21358118iB2 = c21357418i4.LJIIJJI) != null) {
            String string = c21357418i4.LJIIZILJ.toString();
            Effect effect = c21357418i4.LJJIJIIJI;
            if (effect != null) {
                effect_id = effect.getEffect_id();
            } else {
                effect_id = null;
            }
            interfaceC21358118iB2.LJFF(string, effect_id, list.size(), true, false, c21356918hz.LJIIJ, null);
        }
        if (EffectUploadPickerFolderUIExperiment.isEnabled()) {
            ArrayList<C1621190sI1> arrayListLIZ = C09HN.LIZ(list);
            if (arrayListLIZ != null) {
                c21357418i4.LJJIIJZLJL = arrayListLIZ;
            }
            if (map.keySet().contains(c21356918hz) && !C522610KeZ.LIZ() && (interfaceC21358118iB = c21357418i4.LJIIJJI) != null) {
                String string2 = c21357418i4.LJIIZILJ.toString();
                Effect effect2 = c21357418i4.LJJIJIIJI;
                if (effect2 != null) {
                    effect_id2 = effect2.getEffect_id();
                }
                interfaceC21358118iB.LJFF(string2, effect_id2, list.size(), true, false, c21356918hz.LJIIJ, null);
            }
            if ((!list.isEmpty()) && (function0 = c21357418i4.LJIJJ) != null) {
                function0.invoke();
            }
            C1624230sMv c1624230sMv = c21357418i4.LJIJJLI;
            if (c1624230sMv != null && map.size() >= c1624230sMv.LIZLLL) {
                ArrayList arrayList = new ArrayList();
                Iterator<C1621190sI1> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                C21357918i9.LIZJ(arrayList);
                if (!(c21357418i4.LJJ().LIZ() instanceof C212354188i)) {
                    InterfaceC212356188k interfaceC212356188k = c21357418i4.LJIIL;
                    if (interfaceC212356188k != null) {
                        interfaceC212356188k.LJFF(list);
                    }
                } else {
                    c21357418i4.LJIILL();
                }
            }
        }
        return Unit.LIZ;
    }
}
