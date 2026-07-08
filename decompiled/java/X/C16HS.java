package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS276S0000000_31;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.16HS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HS implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() throws JSONException {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public static final void run$0(C16HS c16hs) throws JSONException {
        Long lValueOf;
        long j;
        PlaybookContent playbookContent;
        PlaybookContent playbookContent2;
        C20441214yg.LJIIIZ("PlaybookDetailCustomPreviewFootView", "removeSaveReferenceInInsight success");
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(((C20392414qo) c16hs.l0).LLILLL);
        Long lValueOf2 = null;
        if (c0utjPl1 != null) {
            c0utjPl1.LJIL(EnumC20429414wm.DETAIL, "go_live", null);
        }
        C0UTJ c0utjPl12 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(((C20392414qo) c16hs.l0).LLILLL);
        if (c0utjPl12 != null) {
            c0utjPl12.LJIL(EnumC20429414wm.POLYMERIZATION, "go_live", null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_open", "1");
        Playbook playbook = ((C20392414qo) c16hs.l0).LLILZLL;
        if (playbook != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        jSONObject.put("playbook_id", String.valueOf(lValueOf));
        Playbook playbook2 = ((C20392414qo) c16hs.l0).LLILZLL;
        if (playbook2 != null && (playbookContent2 = playbook2.content) != null) {
            j = playbookContent2.playbookContentId;
        } else {
            j = 0;
        }
        jSONObject.put("playbook_content_id", String.valueOf(j));
        Playbook playbook3 = ((C20392414qo) c16hs.l0).LLILZLL;
        if (playbook3 != null && (playbookContent = playbook3.content) != null) {
            lValueOf2 = Long.valueOf(playbookContent.originalPlaybookContentId);
        }
        jSONObject.put("playbook_original_content_id", String.valueOf(lValueOf2));
        jSONObject.put("is_show_playbook_detail", 0);
        jSONObject.put("is_start_playbook", 1);
        jSONObject.put("panel_entrance", "live_recap");
        jSONObject.put("is_activity", 0);
        jSONObject.put("request_page", "live_recap");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params=");
        sbLIZ.append(jSONObject);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(((C20392414qo) c16hs.l0).LLILLJJLI, C2188811AlT.LIZIZ(sbLIZ), new Bundle());
    }

    public static final void run$1(C16HS c16hs) {
        C20441214yg.LJIIIZ("PlaybookDetailCustomPreviewFootView", "updateSaveReferenceInInsight success");
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853232));
        ((C20392414qo) c16hs.l0).LIZ(true);
    }

    public static final void run$2(C16HS c16hs) {
        C20441214yg.LJIIIZ("PlaybookDetailCustomPreviewFootView", "removeSaveReferenceInInsight success");
        ((C20392414qo) c16hs.l0).LIZ(false);
    }

    public static final void run$3(C16HS c16hs) {
        ((AnonymousClass1639) c16hs.l0).getClass();
    }

    public static final void run$4(C16HS c16hs) {
        C204732159e c204732159e = (C204732159e) c16hs.l0;
        c204732159e.getClass();
        C15AI.LJFF(c204732159e, "complete add time animation");
        C500260Jjc.LJLJLJ(((C204732159e) c16hs.l0).LLIZ, false);
    }

    public static final void run$5(C16HS c16hs) {
        final C20577315fX c20577315fX = (C20577315fX) c16hs.l0;
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(C2471909mP.LJIILIIL(c20577315fX.LLJZ));
        c1331670kl3LJI.LIZLLL = true;
        c1331670kl3LJI.LJJ = EnumC1338240kve.FIT_CENTER;
        SmartImageView smartImageView = c20577315fX.LLJJIII;
        if (smartImageView == null) {
            smartImageView = null;
        }
        c1331670kl3LJI.LJJ(smartImageView);
        c1331670kl3LJI.LJIIJ(new InterfaceC427850Gq7() { // from class: X.15fY
            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                String path;
                c20577315fX.LLLIIIIL = false;
                C1632480saE c1632480saE = C1632480saE.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Load Custom Sticker Error, file path: ");
                if (uri != null) {
                    path = uri.getPath();
                } else {
                    path = null;
                }
                sbLIZ.append(path);
                C201955140j.LJII(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                c20577315fX.LLLIIIIL = true;
                SmartImageView smartImageView2 = null;
                if (animatable == null && C0CHQ.LIZ().getAccountService().isLogin()) {
                    C20577315fX c20577315fX2 = c20577315fX;
                    c20577315fX2.LLL = false;
                    TextView textView = c20577315fX2.LLJJJ;
                    if (textView == null) {
                        textView = null;
                    }
                    C786410Ut5.LLIL(textView, 0);
                    C786410Ut5.LLLLLZ(c20577315fX2.LLLIIIIL(), 0);
                } else {
                    C20577315fX c20577315fX3 = c20577315fX;
                    c20577315fX3.LLL = true;
                    TextView textView2 = c20577315fX3.LLJJJ;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    C786410Ut5.LLIL(textView2, 4);
                    C786410Ut5.LLLLLZ(c20577315fX3.LLLIIIIL(), 4);
                }
                C20577315fX c20577315fX4 = c20577315fX;
                if (!c20577315fX4.LLLF && c428600GrK != null) {
                    SmartImageView smartImageView3 = c20577315fX4.LLJJIII;
                    if (smartImageView3 == null) {
                        smartImageView3 = null;
                    }
                    int width = smartImageView3.getWidth();
                    SmartImageView smartImageView4 = c20577315fX4.LLJJIII;
                    if (smartImageView4 != null) {
                        smartImageView2 = smartImageView4;
                    }
                    int height = smartImageView2.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = c20577315fX4.LLJJLIIIJLLLLLLLZ / c20577315fX4.LLJL;
                    if (f3 > f / f2) {
                        c20577315fX4.LLJLL = width;
                        c20577315fX4.LLJLILLLLZIIL = (int) (width / f3);
                    } else {
                        c20577315fX4.LLJLILLLLZIIL = height;
                        c20577315fX4.LLJLL = (int) (height * f3);
                    }
                    int i = c20577315fX4.LLJLL;
                    c20577315fX4.LLLFF = (c20577315fX4.LLJLIL * 1.0f) / i;
                    int i2 = (width - i) / 2;
                    c20577315fX4.LLLI = i2;
                    int i3 = c20577315fX4.LLJLILLLLZIIL;
                    int i4 = (height - i3) / 2;
                    c20577315fX4.LLLII = i4;
                    c20577315fX4.LLLFFI = i2;
                    c20577315fX4.LLLFZ = i4;
                    float f4 = 2;
                    float f5 = (f - (i * 0.75f)) / f4;
                    float f6 = (f2 - (i3 * 0.75f)) / f4;
                    ArrayList<Coordinate> arrayList = new ArrayList<>();
                    arrayList.add(new Coordinate((c20577315fX4.LLJLL * 0.75f) + f5, f6));
                    arrayList.add(new Coordinate((c20577315fX4.LLJLL * 0.75f) + f5, (c20577315fX4.LLJLILLLLZIIL * 0.75f) + f6));
                    arrayList.add(new Coordinate(f5, (c20577315fX4.LLJLILLLLZIIL * 0.75f) + f6));
                    arrayList.add(new Coordinate(f5, f6));
                    c20577315fX4.LLLIZZ.add(arrayList);
                    c20577315fX4.LLLF = true;
                }
            }
        });
    }

    public static final void run$6(C16HS c16hs) {
        ((PushSettingsLoginVM) c16hs.l0).setState(AFwS276S0000000_31.get$arr$(364));
    }

    public C16HS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public C16HS(C162U c162u, AnonymousClass1639 anonymousClass1639, int i) {
        this.$t = i;
        this.l0 = anonymousClass1639;
    }
}
