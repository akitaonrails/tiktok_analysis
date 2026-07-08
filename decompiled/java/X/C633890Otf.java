package X;

import android.app.Activity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS218S0300000_9;

/* JADX INFO: renamed from: X.0Otf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633890Otf extends C09AY implements Function1<C20656615sK, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ ProfileMusicTabService LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C118300cf LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633890Otf(View view, ProfileMusicTabService profileMusicTabService, C19EG c19eg, C118300cf c118300cf) {
        super(1);
        this.LL = view;
        this.LLILLJJLI = profileMusicTabService;
        this.LLILLL = c19eg;
        this.LLILZ = c118300cf;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C20656615sK c20656615sK) {
        ViewGroup viewGroup;
        C20656615sK c20656615sK2 = c20656615sK;
        View view = this.LL;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C633860Otc.LIZ.getClass();
            final String str = C633860Otc.LIZ().url;
            if (str.length() == 0) {
                c20656615sK2.LIZ();
            } else {
                final C20515215Pi c20515215Pi = new C1257230ioz(viewGroup, true).LIZ;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_bell;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c20515215Pi.LJFF(c419910GdJ);
                final Activity activity = this.LLILLL;
                final C118300cf c118300cf = this.LLILZ;
                String string = activity.getString(2131826701);
                String string2 = activity.getString(2131826702);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append(' ');
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                SpannableString spannableString = new SpannableString(string);
                C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.03tz
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view2) {
                        SmartRouter.buildRoute(activity, str).open();
                        c118300cf.element = 1;
                        c20515215Pi.LIZIZ();
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, activity);
                        if (numLIZJ != null) {
                            textPaint.setColor(numLIZJ.intValue());
                        }
                        textPaint.setUnderlineText(false);
                    }
                }, 0, spannableString.length(), 17);
                SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) spannableString);
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LJFF = spannableStringBuilderAppend;
                c1057450dcl.LJIIJ = 0;
                c1057450dcl.LJIILL = true;
                c20515215Pi.LIZ.LJIILJJIL = new AwS218S0300000_9(c20656615sK2, this.LLILLJJLI, this.LLILZ, 7);
                c20515215Pi.LIZLLL();
                C633880Ote.LIZ.getClass();
                Keva.getRepo("artist_new_release_highlight_repo").storeInt(C633880Ote.LIZJ("artist_music_offline_show_times"), Keva.getRepo("artist_new_release_highlight_repo").getInt(C633880Ote.LIZJ("artist_music_offline_show_times"), 0) + 1);
                Keva.getRepo("artist_new_release_highlight_repo").storeLong(C633880Ote.LIZJ("artist_music_offline_last_show_timestamp"), System.currentTimeMillis());
                this.LLILLJJLI.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("page", "music_tab");
                C20684815ws.LJIILLIIL("aop_authorize_notice_show", c2344009Gk.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
