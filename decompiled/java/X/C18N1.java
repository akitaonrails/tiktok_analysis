package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18N1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18N1 extends AbstractC21274718Nl {
    public static final Set<String> LJLJL = C13LQ.LJLIIL(new String[]{"enter_from", "enter_from_info"});
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public Integer LJIILJJIL;
    public String LJIILL;
    public Integer LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public Integer LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public Map<String, String> LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public Integer LJJIIJ;
    public Integer LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public Integer LJJIJ;
    public Integer LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public String LJJIZ;
    public String LJJJ;
    public Integer LJJJI;
    public String LJJJIL;
    public Integer LJJJJ;
    public Integer LJJJJI;
    public Integer LJJJJIZL;
    public String LJJJJJ;
    public String LJJJJJL;
    public String LJJJJL;
    public Integer LJJJJLI;
    public String LJJJJLL;
    public Integer LJJJJZ;
    public String LJJJJZI;
    public Integer LJJJLIIL;
    public String LJJJLL;
    public String LJJJLZIJ;
    public String LJJJZ;
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public String LJJLIIIJ;
    public Integer LJJLIIIJILLIZJL;
    public Integer LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public Map<String, ? extends Object> LJJLIIIJL;
    public Map<String, ? extends Object> LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public Integer LJJLJ;
    public String LJJLJLI;
    public Integer LJJLL;
    public Boolean LJJZ;
    public Boolean LJJZZI;
    public Boolean LJJZZIII;
    public Map<String, ? extends Object> LJL;
    public Integer LJLI;
    public Integer LJLIIIL;
    public Integer LJLIIL;
    public String LJLIL;
    public Map<String, String> LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public Map<String, String> LJLJJL;
    public String LJLJJLL;

    @Override // X.AbstractC21274718Nl
    public void LIZIZ() {
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        String str = this.LIZLLL;
        InterfaceC21276518Od.LIZ.getClass();
        LIZ("EVENT_ORIGIN_FEATURE", str);
        LIZ("group_id", this.LJ);
        LIZ("author_id", this.LJFF);
        LIZ("request_id", this.LJI);
        LIZ("enter_from", this.LJII);
        LIZ("enter_method", this.LJIIIIZZ);
        LIZ("anchor_show_type", this.LJIIIZ);
        String str2 = this.LJIIJ;
        if (str2 == null) {
            str2 = "";
        }
        LIZ("product_source", str2);
        String str3 = this.LJIIJJI;
        if (str3 != null) {
            LIZ("source_from", str3);
        }
        String str4 = this.LJIIL;
        if (str4 == null) {
            str4 = "";
        }
        LIZ("source", str4);
        String str5 = this.LJIILIIL;
        LIZ("product_id", str5 != null ? str5 : "");
        LIZ("is_self", String.valueOf(this.LJIILJJIL));
        LIZ("is_single_anchor", this.LJIILL);
        LIZ("is_ad", String.valueOf(this.LJIILLIIL));
        LIZ("ad_id", this.LJIIZILJ);
        LIZ("creative_id", this.LJIJ);
        LIZ("page_name", this.LJIJJLI);
        Integer num = this.LJIJJ;
        if (num != null) {
            LIZ("follow_status", String.valueOf(num.intValue()));
        }
        LIZ("entrance_form", this.LJIJI);
        LIZ("anchor_tag", this.LJIL);
        LIZ("biz_type", this.LJJ);
        LIZ("is_mix_product", this.LJJIJLIJ);
        LIZ("shopping_status", this.LJJIL);
        LIZ("click_opportunity", this.LJJLIL);
        LIZ("source_page_type", this.LJJLIIJ);
        LIZ("track_id", this.LJJJ);
        LIZ("rec_session_id", null);
        LIZ("use_cache", "null");
        LIZ("image_url", null);
        LIZ("is_first_show", String.valueOf(this.LJJJI));
        LIZ("click_method", this.LJJJJZI);
        LIZ("multi_anchor_display", String.valueOf(this.LJJJLIIL));
        LIZ("landing_page", this.LJJJLL);
        Integer num2 = this.LJLI;
        if (num2 != null) {
            num2.intValue();
            Integer num3 = this.LJLI;
            LIZ("aweme_type", num3 != null ? num3.toString() : null);
        }
        Integer num4 = this.LJLIIIL;
        if (num4 != null) {
            num4.intValue();
            Integer num5 = this.LJLIIIL;
            LIZ("pic_cnt", num5 != null ? num5.toString() : null);
        }
        Integer num6 = this.LJLIIL;
        if (num6 != null) {
            num6.intValue();
            Integer num7 = this.LJLIIL;
            LIZ("rank", num7 != null ? num7.toString() : null);
        }
        String str6 = this.LJJIFFI;
        if (str6 != null) {
            LIZ("source_page_type", str6);
        }
        String str7 = this.LJJLIIIJJIZ;
        if (str7 != null) {
            LIZ("product_type", str7);
        }
        Integer num8 = this.LJJLIIIJJI;
        if (num8 != null) {
            num8.intValue();
            LIZ("is_full_page", String.valueOf(this.LJJLIIIJJI));
        }
        String str8 = this.LJJJJLL;
        if (str8 != null) {
            LIZ("click_area", str8);
        }
        Integer num9 = this.LJJJJZ;
        if (num9 != null) {
            num9.intValue();
            LIZ("anchor_animation", String.valueOf(this.LJJJJZ));
        }
        Integer num10 = this.LJJJJLI;
        if (num10 != null) {
            LIZ("anchor_type_cnt", String.valueOf(num10.intValue()));
        }
        String str9 = this.LJJJZ;
        if (str9 != null) {
            LIZ("flashsale_status", str9);
        }
        String str10 = this.LJJJLZIJ;
        if (str10 != null) {
            LIZ("countdown_type", str10);
        }
        String str11 = this.LJJL;
        if (str11 != null) {
            LIZ("is_free_shipping", str11);
        }
        String str12 = this.LJJLI;
        if (str12 != null) {
            LIZ("promotion_label_level", str12);
        }
        String str13 = this.LJJLIIIIJ;
        if (str13 != null) {
            LIZ("activity_name", str13);
        }
        LIZ("entrance_info", this.LJJLIIIJLLLLLLLZ);
        LIZ("module_name", this.LJJIZ);
        LIZ("rd_extra", this.LJLIL);
        LIZ("info_list", this.LJJJIL);
        LIZ("video_shopping_list_style", String.valueOf(this.LJJJJ));
        LIZ("pure_ecommerce", String.valueOf(this.LJJJJI));
        LIZ("is_all_closed_loop_product", String.valueOf(this.LJJJJIZL));
        LIZ("volume", this.LJJJJJ);
        LIZ("volume_type", this.LJJJJL);
        LIZ("inherited_volume", this.LJJJJJL);
        String str14 = this.LJJII;
        if (str14 != null) {
            LIZ("list_name", str14);
        }
        String str15 = this.LJJIII;
        if (str15 != null) {
            LIZ("enter_list_form", str15);
        }
        Integer num11 = this.LJJIIJ;
        if (num11 != null) {
            num11.intValue();
            LIZ("stay_time", String.valueOf(this.LJJIIJ));
        }
        Integer num12 = this.LJJIIJZLJL;
        if (num12 != null) {
            num12.intValue();
            LIZ("is_load_data", String.valueOf(this.LJJIIJZLJL));
        }
        String str16 = this.LJJIIZ;
        if (str16 != null) {
            LIZ("quit_type", str16);
        }
        String str17 = this.LJJIIZI;
        if (str17 != null) {
            LIZ("anchor_type", str17);
        }
        Integer num13 = this.LJJIJ;
        if (num13 != null) {
            num13.intValue();
            LIZ("product_cnt", String.valueOf(this.LJJIJ));
        }
        Integer num14 = this.LJJIJIIJI;
        if (num14 != null) {
            num14.intValue();
            LIZ("product_show_cnt", String.valueOf(this.LJJIJIIJI));
        }
        String str18 = this.LJJIJIIJIL;
        if (str18 != null) {
            LIZ("product_ids", str18);
        }
        Integer num15 = this.LJJLJ;
        if (num15 != null) {
            num15.intValue();
            LIZ("panel_open_way", String.valueOf(this.LJJLJ));
        }
        String str19 = this.LJJLJLI;
        if (str19 != null) {
            LIZ("panel_open_source", str19);
        }
        Integer num16 = this.LJJLL;
        if (num16 != null) {
            num16.intValue();
            LIZ("panel_click_mathod", String.valueOf(this.LJJLL));
        }
        Boolean bool = this.LJJZ;
        if (bool != null) {
            bool.booleanValue();
            LIZ("panel_enable_maybe_you_like", String.valueOf(this.LJJZ));
        }
        Boolean bool2 = this.LJJZZI;
        if (bool2 != null) {
            bool2.booleanValue();
            LIZ("panel_enable_promotion_banner", String.valueOf(this.LJJZZI));
        }
        Boolean bool3 = this.LJJZZIII;
        if (bool3 != null) {
            bool3.booleanValue();
            LIZ("panel_enbale_claim_voucher", String.valueOf(this.LJJZZIII));
        }
        LIZ("duration", this.LJJIJIL);
        String str20 = this.LJJIJL;
        if (str20 != null) {
            LIZ("item_order", str20);
        }
        String str21 = this.LJJLIIIJ;
        if (str21 != null) {
            LIZ("item_order", str21);
        }
        Integer num17 = this.LJJLIIIJILLIZJL;
        if (num17 != null) {
            LIZ("is_add_maybe_you_like", String.valueOf(num17.intValue()));
        }
        String str22 = this.LJLJI;
        if (str22 != null) {
            LIZ("is_content_truncate", str22);
        }
        String str23 = this.LJLJJI;
        if (str23 != null) {
            LIZ("anchor_content_size", str23);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApmDependencyService.class.getName(), anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        LIZ("traceparent", ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newTrackingTraceparent());
        Map<String, String> map = this.LJJI;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (LJLJL.contains(key) || !this.LIZIZ.containsKey(key)) {
                    String value = entry.getValue();
                    InterfaceC21276518Od.LIZ.getClass();
                    LIZ(key, value);
                }
            }
        }
        Map<String, String> map2 = this.LJLILLLLZI;
        if (map2 != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map2).entrySet()) {
                String str24 = (String) entry2.getKey();
                String str25 = (String) entry2.getValue();
                InterfaceC21276518Od.LIZ.getClass();
                LIZ(str24, str25);
            }
        }
        Map<String, String> map3 = this.LJLJJL;
        if (map3 != null) {
            for (Map.Entry entry3 : ((LinkedHashMap) map3).entrySet()) {
                String str26 = (String) entry3.getKey();
                String str27 = (String) entry3.getValue();
                InterfaceC21276518Od.LIZ.getClass();
                LIZ(str26, str27);
            }
        }
        Map<String, ? extends Object> map4 = this.LJJLIIIJL;
        if (map4 != null) {
            for (Map.Entry<String, ? extends Object> entry4 : map4.entrySet()) {
                String key2 = entry4.getKey();
                String string = entry4.getValue().toString();
                InterfaceC21276518Od.LIZ.getClass();
                LIZ(key2, string);
            }
        }
        String str28 = this.LJLJJLL;
        if (str28 != null) {
            InterfaceC21276518Od.LIZ.getClass();
            LIZ("product_promotion_tag", str28);
        }
        Map<String, ? extends Object> map5 = this.LJJLIIIJLJLI;
        if (map5 != null) {
            for (Map.Entry<String, ? extends Object> entry5 : map5.entrySet()) {
                String key3 = entry5.getKey();
                String string2 = entry5.getValue().toString();
                InterfaceC21276518Od.LIZ.getClass();
                LIZ(key3, string2);
            }
        }
    }

    public C18N1(String str) {
        super(str);
    }
}
