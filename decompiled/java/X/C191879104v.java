package X;

import Y.AfS197S0100000_28;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.104v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191879104v {
    public static final C191879104v LIZ = new C191879104v();
    public static final List<InterfaceC989510brB<PrivacySettingsRestriction>> LIZIZ = new CopyOnWriteArrayList();

    public static void LIZ(String str, Function0 function0) {
        InterfaceC191883104z interfaceC191883104z = (InterfaceC191883104z) C191882104y.LIZ.getValue();
        InterfaceC191883104z.LIZ.getClass();
        String str2 = C191878104u.LIZIZ;
        C1888930zFr.LIZIZ(interfaceC191883104z.LIZIZ(str2), str2, C2097608Jq.LJIIIIZZ(new Pair("scenario", str), new Pair("report_to_tea", "true"))).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS197S0100000_28(function0, 41), new C09JN() { // from class: X.00Pf
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RestrictionApiManager@fd07.fetchPrivacyRestrictionBackground$2");
                C1C7U.LIZIZ("RestrictionApiManager@fd07.fetchPrivacyRestrictionBackground$2");
            }
        });
    }

    public static PrivacySettingsRestrictionItem LIZIZ(int i, String str) {
        PrivacySettingsRestriction privacySettingsRestriction;
        Map<String, PrivacySettingsRestrictionItem> map;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem;
        RestrictionResponse restrictionResponseLIZ = C191874104q.LIZ();
        if (restrictionResponseLIZ != null && (privacySettingsRestriction = restrictionResponseLIZ.getPrivacySettingsRestriction()) != null) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    map = privacySettingsRestriction.videoPrivacy;
                }
            } else {
                map = privacySettingsRestriction.account;
            }
            if (map != null && (privacySettingsRestrictionItem = map.get(str)) != null) {
                return privacySettingsRestrictionItem;
            }
            if (i == 0) {
                return null;
            }
        } else if (i == 0 && Intrinsics.LJFF(str, "group_chat")) {
            return null;
        }
        return new PrivacySettingsRestrictionItem(2, 0, null, 0, -1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.Integer r4, java.lang.String r5) {
        /*
            r3 = 0
            if (r4 == 0) goto L17
            int r2 = r4.intValue()
            X.01GW r0 = X.C191882104y.LIZ
            java.lang.Object r1 = r0.getValue()
            X.104z r1 = (X.InterfaceC191883104z) r1
            r0 = 12
            X.11NZ r1 = X.AnonymousClass1050.LIZ(r1, r5, r2, r3, r0)
            if (r1 != 0) goto L2a
        L17:
            X.01GW r0 = X.C191882104y.LIZ
            java.lang.Object r1 = r0.getValue()
            X.104z r1 = (X.InterfaceC191883104z) r1
            X.104u r0 = X.InterfaceC191883104z.LIZ
            r0.getClass()
            java.lang.String r0 = X.C191878104u.LIZJ
            X.11NZ r1 = r1.LIZJ(r5, r0)
        L2a:
            X.104u r0 = X.InterfaceC191883104z.LIZ
            r0.getClass()
            java.lang.String r0 = X.C191878104u.LIZJ
            X.11NZ r1 = X.C1888930zFr.LIZIZ(r1, r0, r3)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r1.LJJJLZIJ(r0)
            X.00Pg<T> r1 = new X.C09JN() { // from class: X.00Pg
                static {
                    /*
                        X.00Pg r0 = new X.00Pg
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.00Pg<T>) X.00Pg.LL X.00Pg
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C073800Pg.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C073800Pg.<init>():void");
                }

                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "RestrictionApiManager@fd07.updateAgreementBackground$2"
                        X.C1C7U.LIZ(r0)
                        X.C1C7U.LIZIZ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C073800Pg.accept(java.lang.Object):void");
                }
            }
            X.00Ph<T> r0 = new X.C09JN() { // from class: X.00Ph
                static {
                    /*
                        X.00Ph r0 = new X.00Ph
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.00Ph<T>) X.00Ph.LL X.00Ph
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C073900Ph.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C073900Ph.<init>():void");
                }

                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "RestrictionApiManager@fd07.updateAgreementBackground$3"
                        X.C1C7U.LIZ(r0)
                        X.C1C7U.LIZIZ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C073900Ph.accept(java.lang.Object):void");
                }
            }
            r2.LJJLL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191879104v.LIZJ(java.lang.Integer, java.lang.String):void");
    }
}
