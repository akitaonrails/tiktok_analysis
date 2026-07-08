package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0P4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639080P4w extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C639080P4w(InterfaceC634840OvC interfaceC634840OvC, InterfaceC600420Ngm interfaceC600420Ngm, int i) {
        super(4);
        this.$t = i;
        this.l0 = interfaceC634840OvC;
        this.l1 = interfaceC600420Ngm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C639080P4w(List list, MusicListComposableAssem musicListComposableAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = musicListComposableAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C639080P4w(List list, OriginMusicListViewModel originMusicListViewModel, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = originMusicListViewModel;
    }

    public static final Object invoke$0(C639080P4w c639080P4w, Object obj, Object obj2, Object obj3, Object obj4) {
        ((InterfaceC634840OvC) c639080P4w.l0).sendEvent(((InterfaceC600420Ngm) c639080P4w.l1).getName(), new C599200Neo((String) obj, (Map) obj2, (Map) obj3, null, 24).LJLIIIL());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C639080P4w c639080P4w, Object obj, Object obj2, Object obj3, Object obj4) {
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
            Object obj5 = ListProtector.get((List) c639080P4w.l0, iIntValue);
            int i4 = (i & 112) | (i & 14);
            interfaceC1680500tpg.LJJIIJZLJL(1763294475);
            ((MusicListComposableAssem) c639080P4w.l1).dp((InterfaceC1891350zJl) obj5, iIntValue, interfaceC1680500tpg, (i4 & 112) | ((i4 >> 6) & 14));
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$2(X.C639080P4w r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C639080P4w.invoke$2(X.0P4w, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
