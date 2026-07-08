package X;

import Y.ARunnableS126S0100000_26;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15WC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15WC implements InterfaceC1848620yCq {
    public C15WD LL;

    @Override // X.InterfaceC1848620yCq
    public final String getEventName() {
        return "card_cover_load";
    }

    public final void LIZ() throws JSONException {
        C15WD c15wd = this.LL;
        if (c15wd == null || c15wd.LIZ == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c15wd.LIZ;
        if (c15wd.LJIIL == C15WE.FROM_UNKNOW) {
            LIZLLL(c15wd.LJJI);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("enter_from", "homepage_explore");
        jSONObject.putOpt("group_id", c15wd.LIZJ);
        jSONObject.putOpt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(c15wd.LIZIZ.getValue()));
        jSONObject.putOpt("width", Integer.valueOf(c15wd.LJ));
        jSONObject.putOpt("height", Integer.valueOf(c15wd.LJFF));
        jSONObject.putOpt("resolution", c15wd.LIZLLL.getFormat());
        jSONObject.putOpt("position", Integer.valueOf(c15wd.LJIIJJI));
        jSONObject.putOpt("duration", jCurrentTimeMillis >= 0 ? Long.valueOf(jCurrentTimeMillis) : c15wd.LJIILIIL);
        jSONObject.putOpt("err_code", c15wd.LJI);
        jSONObject.putOpt("decode_duration", Long.valueOf(c15wd.LJII));
        jSONObject.putOpt("image_format", c15wd.LJIIIIZZ);
        jSONObject.putOpt("from_source", Integer.valueOf(c15wd.LJIIL.getValue()));
        jSONObject.putOpt("is_first_screen", Integer.valueOf(c15wd.LJIIJ ? 1 : 0));
        jSONObject.putOpt("data_source", Integer.valueOf(c15wd.LJIIIZ.getValue()));
        jSONObject.putOpt("bitmap_config", c15wd.LJIILJJIL);
        jSONObject.putOpt("aweme_type", c15wd.LJIILL);
        jSONObject.putOpt("cover_expired_time", c15wd.LJIILLIIL);
        jSONObject.putOpt("has_expired_duration", c15wd.LJIIZILJ);
        jSONObject.putOpt("image_load_error_code", c15wd.LJIJI);
        jSONObject.putOpt("image_status", c15wd.LJIJJ);
        jSONObject.putOpt("err_msg", c15wd.LJIJ);
        jSONObject.putOpt("url", String.valueOf(c15wd.LJJI));
        jSONObject.putOpt("from_explore_page", c15wd.LJIJJLI);
        jSONObject.putOpt("err_extra", c15wd.LJIL);
        jSONObject.putOpt("disappear_reason", c15wd.LJJ);
        jSONObject.putOpt("network_quality_evaluation", Integer.valueOf(C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZIZ));
        jSONObject.putOpt("image_priority", Integer.valueOf(c15wd.LJJIFFI));
        jSONObject.putOpt("freshness", c15wd.LJJII > 0 ? Long.valueOf(((long) C0XK4.LIZ()) - c15wd.LJJII) : null);
        synchronized (jSONObject) {
            try {
                C1848630yCr.LIZ(this, C475630Ikz.LIZ(jSONObject));
                C20684815ws.LJFF().execute(new ARunnableS126S0100000_26(jSONObject, 70));
                this.LL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(EnumC1334360kpO enumC1334360kpO) {
        C15WD c15wd = this.LL;
        if (c15wd != null) {
            int i = C1334370kpP.LIZ[enumC1334360kpO.ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        if (i != 4) {
                            i2 = -1;
                        }
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 0;
            }
            c15wd.LJJIFFI = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.net.Uri r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L14
            X.0kbA r3 = X.C1322200kVm.LIZ()
            X.15WD r2 = r4.LL
            if (r2 == 0) goto L14
            boolean r0 = r3.LJIIJJI(r5)
            if (r0 == 0) goto L15
            X.15WE r0 = X.C15WE.FROM_MEMORYCACHE
        L12:
            r2.LJIIL = r0
        L14:
            return
        L15:
            X.0kbC r1 = X.EnumC1325560kbC.SMALL
            X.0kbQ r0 = X.C1325700kbQ.LIZLLL(r5)
            r0.LJI = r1
            X.0kbR r0 = r0.LIZ()
            boolean r0 = r3.LJIILJJIL(r0)
            if (r0 != 0) goto L4e
            X.0kbC r1 = X.EnumC1325560kbC.DEFAULT
            X.0kbQ r0 = X.C1325700kbQ.LIZLLL(r5)
            r0.LJI = r1
            X.0kbR r0 = r0.LIZ()
            boolean r0 = r3.LJIILJJIL(r0)
            if (r0 != 0) goto L4e
            X.0kbC r1 = X.EnumC1325560kbC.CUSTOM
            X.0kbQ r0 = X.C1325700kbQ.LIZLLL(r5)
            r0.LJI = r1
            X.0kbR r0 = r0.LIZ()
            boolean r0 = r3.LJIILJJIL(r0)
            if (r0 != 0) goto L4e
            X.15WE r0 = X.C15WE.FROM_NETWORK
            goto L12
        L4e:
            X.15WE r0 = X.C15WE.FROM_DISKCACHE
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15WC.LIZLLL(android.net.Uri):void");
    }

    public final void LJ(Uri uri) {
        Long lLJIILIIL;
        if (uri == null) {
            return;
        }
        C15WD c15wd = this.LL;
        if (c15wd != null) {
            c15wd.LJJI = uri;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "x-expires");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            lLJIILIIL.longValue();
            C15WD c15wd2 = this.LL;
            if (c15wd2 != null) {
                c15wd2.LJIILLIIL = lLJIILIIL;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (lLJIILIIL.toString().length() == 10) {
                jCurrentTimeMillis /= (long) LSPassThroughRecordSizeConfig.DEFAULT;
            }
            C15WD c15wd3 = this.LL;
            if (c15wd3 != null) {
                c15wd3.LJIIZILJ = Long.valueOf(jCurrentTimeMillis - lLJIILIIL.longValue());
            }
        }
    }

    public final void LIZIZ(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            C15WD c15wd = this.LL;
            if (c15wd != null) {
                c15wd.LJ = num.intValue();
            }
            C15WD c15wd2 = this.LL;
            if (c15wd2 != null) {
                c15wd2.LJFF = num2.intValue();
            }
            C15WD c15wd3 = this.LL;
            if (c15wd3 != null) {
                C0SAW c0saw = C0SAV.Companion;
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                c0saw.getClass();
                c15wd3.LIZLLL = C0SAW.LIZ(iIntValue, iIntValue2);
            }
        }
    }
}
