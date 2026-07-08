package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLiveShopListClientRequestConfigDetail;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17wM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21191217wM extends C21208517z9 {
    public static final /* synthetic */ int LLLF = 0;

    @Override // X.C21208517z9
    public final boolean LJFF() {
        return Intrinsics.LJFF(((EcLiveShopListClientRequestConfigDetail) C21191117wL.LIZIZ.getValue()).enable, Boolean.TRUE);
    }

    @Override // X.C21208517z9
    public final void LJI(Map<String, Object> map) {
        String str;
        CommerceStruct commerceStruct;
        Room room = this.LLILZ;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null && commerceStruct.isEcomShoppingMode()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("shopping_mode", str);
    }

    @Override // X.C21208517z9
    public final void LJIILJJIL(Map map) {
        if (LJFF()) {
            C23250099c.LIZLLL(this.LLJJL, null, null, new C0CSW(0, this, map, null), 3);
        }
    }

    @Override // X.C21208517z9, X.InterfaceC21209217zG
    public final void is1(boolean z) {
        C21208817zC c21208817zC;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("ttec_us_shop_bag_list_final", 0) > 0) {
            if (((Boolean) this.LLJJJIL.getValue()).booleanValue() && (c21208817zC = this.LLJ) != null && c21208817zC.LLILZ != null) {
                return;
            }
            if (this.LLJL && this.LLIZLLLIL != null) {
                return;
            }
            this.LLJLL = true;
            if (!z) {
                return;
            }
            C23250099c.LIZLLL(this.LLJJJJLIIL, null, null, new C0CSV(this, null), 3);
            return;
        }
        super.is1(z);
    }

    public C21191217wM(long j, C1743900vTw c1743900vTw, WeakReference<C21212117zj> weakReference) {
        super(c1743900vTw, weakReference);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(int r6, X.C21191217wM r7, java.util.Map r8, X.InterfaceC1364105Vn r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C0CSY
            if (r0 == 0) goto L5a
            r4 = r9
            X.0CSY r4 = (X.C0CSY) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L4c
            if (r1 != r0) goto L60
            X.17wM r7 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            java.lang.String r3 = (java.lang.String) r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LLILZ
            if (r0 == 0) goto L4a
            long r0 = r0.getId()
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
        L32:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.189t r0 = X.C212391189t.LIZ
            r0.getClass()
            java.lang.String r0 = "prerender_bag_assemble"
            X.C212391189t.LIZIZ(r0, r2, r3)
            java.lang.String r1 = "product_update"
            java.lang.String r0 = ""
            X.C212391189t.LIZIZ(r1, r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4a:
            r0 = 0
            goto L32
        L4c:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r7
            r4.LLILZ = r0
            java.lang.Object r3 = r7.LJIIIIZZ(r6, r8, r4)
            if (r3 != r2) goto L24
            return r2
        L5a:
            X.0CSY r4 = new X.0CSY
            r4.<init>(r5, r9)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21191217wM.LJIJI(int, X.17wM, java.util.Map, X.05Vn):java.lang.Object");
    }
}
