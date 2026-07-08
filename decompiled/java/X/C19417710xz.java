package X;

import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvider;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.10xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19417710xz extends AbstractC19417810y0 {
    public TextView LLJJLIIIJLLLLLLLZ;
    public TextView LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public TextView LLJLLIL;
    public View LLJLLL;
    public C19404910vv LLJZ;

    @Override // X.AbstractC19417810y0
    public int getLayoutResId() {
        return R.layout.aex;
    }

    @Override // X.AbstractC19417810y0
    public final void LIZIZ() {
        ((ArrayList) this.LLJJIJIIJIL).add(ChallengeDetailProvider.LIZLLL().LIZ());
    }

    @Override // X.AbstractC19417810y0
    public final void LIZJ() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.b_k);
        viewStub.setLayoutResource(getAttrsResId());
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        this.LLJJLIIIJLLLLLLLZ = (TextView) viewLJLLLL.findViewById(R.id.b_n);
        this.LLJL = (TextView) viewLJLLLL.findViewById(R.id.b_l);
        this.LLJLIL = viewLJLLLL;
        ViewStub viewStub2 = (ViewStub) findViewById(R.id.d78);
        viewStub2.setLayoutResource(getButtonResId());
        View viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub2);
        this.LLJZ = new C19404910vv(viewLJLLLL2.findViewById(R.id.e6f), (C11FU) viewLJLLLL2.findViewById(R.id.lcg), (TextView) viewLJLLLL2.findViewById(R.id.zec), getDetailParam());
        this.LLJLILLLLZIIL = viewLJLLLL2;
        super.LIZJ();
        SmartImageView mAvatar = getMAvatar();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(120.0f)));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(120.0f)));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_number;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(60.0f)));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(60.0f)));
        mAvatar.setPlaceholderImage(new LayerDrawable(new Drawable[]{c384050F3z.LIZ(getContext()), c419910GdJ.LIZ(getContext())}));
    }

    @Override // X.AbstractC19417810y0
    public int getAttrsResId() {
        int i = C993390bxR.LIZ[getMHeaderParam().LIZIZ.ordinal()];
        if (i == 1 || i == 2) {
            return R.layout.aer;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19417810y0
    public int getButtonResId() {
        int i = C993390bxR.LIZIZ[getMHeaderParam().LIZJ.ordinal()];
        if (i == 1) {
            return R.layout.aes;
        }
        if (i == 2) {
            return R.layout.aet;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19417810y0
    public final void LIZ(ChallengeDetail challengeDetail) {
        boolean z;
        boolean z2;
        C1360500lVY c1360500lVY;
        long useCount;
        int userCount;
        int userCount2;
        int useCount2;
        long useCount3;
        int i;
        String nickname;
        boolean z3;
        String nickname2;
        Integer numValueOf;
        String secUid;
        boolean z4;
        boolean z5;
        int i2;
        float fLIZJ;
        int length;
        Challenge mChallenge;
        Challenge mChallenge2;
        if (challengeDetail.challenge == null) {
            return;
        }
        super.LIZ(challengeDetail);
        boolean zBooleanValue = ((Boolean) C2268761Dr8.LIZIZ.getValue()).booleanValue();
        if (!((Boolean) C1866730yg3.LIZ.getValue()).booleanValue() || (!zBooleanValue && (mChallenge2 = getMChallenge()) != null && mChallenge2.isCommerceAndValid())) {
            z = false;
        } else {
            z = true;
        }
        if (!((Boolean) C1866730yg3.LIZIZ.getValue()).booleanValue() || (!zBooleanValue && (mChallenge = getMChallenge()) != null && mChallenge.isCommerceAndValid())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            TextView textView = this.LLJL;
            if (textView == null) {
                textView = null;
            }
            C337180DJs.LIZIZ(textView);
        } else {
            TextView textView2 = this.LLJL;
            if (textView2 == null) {
                textView2 = null;
            }
            C337180DJs.LIZJ(textView2);
            if (z2) {
                Challenge mChallenge3 = getMChallenge();
                if (mChallenge3 != null) {
                    useCount = mChallenge3.getUseCount();
                } else {
                    useCount = -1;
                }
                if (useCount > -1) {
                    C1360520lVa c1360520lVa = new C1360520lVa();
                    Resources resources = getContext().getResources();
                    Challenge mChallenge4 = getMChallenge();
                    if (mChallenge4 != null) {
                        useCount2 = (int) mChallenge4.getUseCount();
                    } else {
                        useCount2 = 0;
                    }
                    Object[] objArr = new Object[1];
                    Challenge mChallenge5 = getMChallenge();
                    if (mChallenge5 != null) {
                        useCount3 = mChallenge5.getUseCount();
                    } else {
                        useCount3 = 0;
                    }
                    objArr[0] = C1843500y4a.LIZIZ(useCount3);
                    c1360520lVa.LIZ.append((CharSequence) resources.getQuantityString(2131755220, useCount2, objArr));
                    c1360500lVY = c1360520lVa.LIZ;
                } else {
                    C1360520lVa c1360520lVa2 = new C1360520lVa();
                    Resources resources2 = getContext().getResources();
                    Challenge mChallenge6 = getMChallenge();
                    if (mChallenge6 != null) {
                        userCount = mChallenge6.getUserCount();
                    } else {
                        userCount = 0;
                    }
                    Object[] objArr2 = new Object[1];
                    Challenge mChallenge7 = getMChallenge();
                    if (mChallenge7 != null) {
                        userCount2 = mChallenge7.getUserCount();
                    } else {
                        userCount2 = 0;
                    }
                    objArr2[0] = C1843500y4a.LIZIZ(userCount2);
                    c1360520lVa2.LIZ.append((CharSequence) resources2.getQuantityString(2131755220, userCount, objArr2));
                    c1360500lVY = c1360520lVa2.LIZ;
                }
            } else {
                C1360520lVa c1360520lVa3 = new C1360520lVa();
                c1360520lVa3.LIZ.append((CharSequence) getContext().getResources().getQuantityString(2131755370, (int) getMChallenge().getDisplayCount(), C1843500y4a.LIZIZ(getMChallenge().getDisplayCount())));
                c1360500lVY = c1360520lVa3.LIZ;
            }
            TextView textView3 = this.LLJL;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(c1360500lVY);
        }
        TextView textView4 = this.LLJJLIIIJLLLLLLLZ;
        if (textView4 == null) {
            textView4 = null;
        }
        C786410Ut5.LLIL(textView4, 8);
        if (getMChallenge().isCommerce() && getMChallenge().getAuthor() != null && (nickname = getMChallenge().getAuthor().getNickname()) != null && nickname.length() != 0) {
            TextView textView5 = this.LLJJLIIIJLLLLLLLZ;
            if (textView5 == null) {
                textView5 = null;
            }
            C786410Ut5.LLIL(textView5, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean zLIZ = C19406510wB.LIZ(getMChallenge().getSponsorLabelText());
            if (C19406510wB.LIZ(getMChallenge().getSponsorAdLabel()) && !zLIZ) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (zLIZ) {
                nickname2 = getMChallenge().getSponsorLabelText();
                numValueOf = Integer.valueOf(a0.LJJJ(nickname2, getMChallenge().getAuthor().getNickname(), 0, false, 6));
            } else {
                if (C19406510wB.LIZ(getMChallenge().getSponsorAdLabel())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(getMChallenge().getSponsorAdLabel());
                    sbLIZ.append(getContext().getResources().getString(2131848665));
                    sbLIZ.append(getContext().getResources().getString(2131848665));
                    sbLIZ.append(getMChallenge().getAuthor().getNickname());
                    nickname2 = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    nickname2 = getMChallenge().getAuthor().getNickname();
                }
                numValueOf = null;
            }
            User author = getMChallenge().getAuthor();
            if (author != null) {
                secUid = author.getSecUid();
            } else {
                secUid = null;
            }
            if (C19406510wB.LIZ(secUid)) {
                if (getMChallenge().getAuthor().getCommerceUserLevel() == 2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(nickname2);
                    sbLIZ2.append(getContext().getResources().getString(2131848665));
                    nickname2 = C2188811AlT.LIZIZ(sbLIZ2);
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = true;
            } else {
                z4 = false;
                z5 = false;
            }
            if (z3) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            int iLJIIIIZZ = C14KQ.LJIIIIZZ(getContext()) - ((int) C12ES.LIZJ(168.0f, getContext()));
            if (z3) {
                fLIZJ = C12ES.LIZJ(10.0f, getContext());
            } else {
                fLIZJ = 0.0f;
            }
            if (z5) {
                fLIZJ += C12ES.LIZJ(10.0f, getContext());
                if (z4) {
                    fLIZJ += C12ES.LIZJ(10.0f, getContext());
                }
            }
            TextView textView6 = this.LLJJLIIIJLLLLLLLZ;
            if (textView6 == null) {
                textView6 = null;
            }
            DynamicLayout dynamicLayout = new DynamicLayout(nickname2, textView6.getPaint(), iLJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            int lineCount = dynamicLayout.getLineCount();
            if (lineCount >= i2) {
                int i3 = i2 - 1;
                nickname2 = nickname2.subSequence(0, dynamicLayout.getLineEnd(i3)).toString();
                if (lineCount > i2) {
                    nickname2 = LJFF(nickname2.length() - 2, nickname2, z4);
                    TextView textView7 = this.LLJJLIIIJLLLLLLLZ;
                    if (textView7 == null) {
                        textView7 = null;
                    }
                    dynamicLayout = new DynamicLayout(nickname2, textView7.getPaint(), iLJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                }
                while (dynamicLayout.getLineCount() > i2) {
                    nickname2 = LJFF(nickname2.length() - 5, nickname2, z4);
                    TextView textView8 = this.LLJJLIIIJLLLLLLLZ;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    dynamicLayout = new DynamicLayout(nickname2, textView8.getPaint(), iLJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                }
                float f = iLJIIIIZZ;
                TextView textView9 = this.LLJJLIIIJLLLLLLLZ;
                if (textView9 == null) {
                    textView9 = null;
                }
                float fMeasureText = f - textView9.getPaint().measureText(nickname2, dynamicLayout.getLineStart(i3), dynamicLayout.getLineEnd(i3));
                if (dynamicLayout.getLineCount() == i2 && fMeasureText < fLIZJ) {
                    nickname2 = LJFF(nickname2.length() - 2, nickname2, z4);
                    TextView textView10 = this.LLJJLIIIJLLLLLLLZ;
                    if (textView10 == null) {
                        textView10 = null;
                    }
                    DynamicLayout dynamicLayout2 = new DynamicLayout(nickname2, textView10.getPaint(), iLJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    while (dynamicLayout2.getLineCount() > i2) {
                        nickname2 = LJFF(nickname2.length() - 5, nickname2, z4);
                        TextView textView11 = this.LLJJLIIIJLLLLLLLZ;
                        if (textView11 == null) {
                            textView11 = null;
                        }
                        dynamicLayout2 = new DynamicLayout(nickname2, textView11.getPaint(), iLJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    }
                }
                while (fMeasureText < fLIZJ) {
                    nickname2 = LJFF(nickname2.length() - 5, nickname2, z4);
                    TextView textView12 = this.LLJJLIIIJLLLLLLLZ;
                    if (textView12 == null) {
                        textView12 = null;
                    }
                    DynamicLayout dynamicLayout3 = new DynamicLayout(nickname2, textView12.getPaint(), iLJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    TextView textView13 = this.LLJJLIIIJLLLLLLLZ;
                    if (textView13 == null) {
                        textView13 = null;
                    }
                    fMeasureText = f - textView13.getPaint().measureText(nickname2, dynamicLayout3.getLineStart(i3), dynamicLayout3.getLineEnd(i3));
                }
            }
            spannableStringBuilder.append((CharSequence) nickname2);
            if (z3) {
                final Context context = getContext();
                final int iLIZ = C446980Hfs.LIZ(getContext(), R.color.ak);
                final String sponsorAdLabel = getMChallenge().getSponsorAdLabel();
                final int iLIZ2 = C446980Hfs.LIZ(getContext(), R.color.dj);
                C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(context, iLIZ, sponsorAdLabel, iLIZ2) { // from class: X.0GWV
                    public String LL;
                    public float LLILLJJLI;
                    public final float LLILLL;
                    public float LLILZ;
                    public float LLILZIL;
                    public float LLILZLL;
                    public float LLIZ;
                    public int LLIZLLLIL;
                    public int LLJ;

                    {
                        float fWidth;
                        if (TextUtils.isEmpty(sponsorAdLabel)) {
                            return;
                        }
                        Context contextN3 = C786410Ut5.N3(context);
                        this.LLIZLLLIL = iLIZ;
                        this.LL = sponsorAdLabel;
                        float fApplyDimension = TypedValue.applyDimension(1, 1.0f, contextN3.getResources().getDisplayMetrics());
                        this.LLIZ = fApplyDimension;
                        this.LLILLJJLI = 16.0f * fApplyDimension;
                        this.LLILZ = fApplyDimension * 4.0f;
                        this.LLILZLL = 10.0f * fApplyDimension;
                        this.LLJ = iLIZ2;
                        this.LLILZIL = fApplyDimension * 3.0f;
                        if (sponsorAdLabel.length() > 1) {
                            Rect rect = new Rect();
                            Paint paint = new Paint();
                            paint.setTextSize(this.LLILZLL);
                            paint.getTextBounds(sponsorAdLabel, 0, sponsorAdLabel.length(), rect);
                            fWidth = rect.width() + (this.LLIZ * 4.0f * 2.0f);
                        } else {
                            fWidth = this.LLILLJJLI;
                        }
                        this.LLILLL = fWidth;
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                        return (int) (this.LLILLL + this.LLILZIL);
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f2, int i6, int i7, int i8, Paint paint) {
                        float f3;
                        Paint paint2 = new Paint();
                        paint2.setColor(this.LLIZLLLIL);
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setAntiAlias(true);
                        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                        float f4 = fontMetrics.descent;
                        float f5 = fontMetrics.ascent;
                        float f6 = i7 + (((f4 - f5) - this.LLILLJJLI) / 2.0f) + f5;
                        if (f2 != 0.0f) {
                            f3 = this.LLILZIL + f2;
                        } else {
                            f3 = f2;
                        }
                        RectF rectF = new RectF(f3, f6, this.LLILLL + f3, this.LLILLJJLI + f6);
                        float f7 = this.LLILZ;
                        canvas.drawRoundRect(rectF, f7, f7, paint2);
                        TextPaint textPaint = new TextPaint();
                        textPaint.setTextSize(this.LLILZLL);
                        textPaint.setColor(this.LLJ);
                        C444890HcV c444890HcV = new C444890HcV();
                        c444890HcV.LIZ(82);
                        textPaint.setTypeface(c444890HcV.getTypeface());
                        textPaint.setAntiAlias(true);
                        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
                        if (f2 != 0.0f) {
                            f2 += this.LLILZIL;
                        }
                        RectF rectF2 = new RectF(f2, f6, this.LLILLL + f2, this.LLILLJJLI + f6);
                        int i9 = (int) ((((rectF2.bottom + rectF2.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2.0f);
                        String str = this.LL;
                        float f8 = this.LLIZ;
                        float f9 = f2 + (4.0f * f8);
                        float f10 = f8 * 0.5f;
                        canvas.drawText(str, f9 - f10, i9 - f10, textPaint);
                    }
                }, 0, getMChallenge().getSponsorAdLabel().length(), 33);
            }
            if (z4) {
                TextView textView14 = this.LLJJLIIIJLLLLLLLZ;
                if (textView14 == null) {
                    textView14 = null;
                }
                C416750GVt c416750GVt = new C416750GVt(textView14.getContext(), R.drawable.ax8);
                spannableStringBuilder.append((CharSequence) e3.d);
                C786410Ut5.q2(spannableStringBuilder, c416750GVt, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            if (z5) {
                Drawable drawable = getContext().getResources().getDrawable(R.drawable.ax9);
                if (C444960Hcc.LIZIZ()) {
                    drawable = getContext().getResources().getDrawable(R.drawable.ax7);
                }
                drawable.setBounds(0, 0, (int) C12ES.LIZJ(10.0f, getContext()), (int) C12ES.LIZJ(10.0f, getContext()));
                C416750GVt c416750GVt2 = new C416750GVt(drawable);
                spannableStringBuilder.append((CharSequence) e3.d);
                C786410Ut5.q2(spannableStringBuilder, c416750GVt2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            if (zLIZ && numValueOf != null && numValueOf.intValue() > -1) {
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), Math.min(numValueOf.intValue(), spannableStringBuilder.length() - 1), Math.min(numValueOf.intValue() + getMChallenge().getAuthor().getNickname().length(), spannableStringBuilder.length()), 33);
            }
            if (z5) {
                C1401770ma7 c1401770ma7 = new C1401770ma7(this, 0);
                if (z3) {
                    length = getMChallenge().getSponsorAdLabel().length() + 1;
                } else {
                    length = 0;
                }
                C786410Ut5.q2(spannableStringBuilder, c1401770ma7, length, spannableStringBuilder.length(), 33);
                TextView textView15 = this.LLJJLIIIJLLLLLLLZ;
                if (textView15 == null) {
                    textView15 = null;
                }
                textView15.setMovementMethod(LinkMovementMethod.getInstance());
            }
            TextView textView16 = this.LLJJLIIIJLLLLLLLZ;
            if (textView16 == null) {
                textView16 = null;
            }
            textView16.setText(spannableStringBuilder);
        }
        C19404910vv c19404910vv = this.LLJZ;
        if (c19404910vv == null) {
            c19404910vv = null;
        }
        Challenge mChallenge8 = getMChallenge();
        C19406610wC mHeaderParam = getMHeaderParam();
        c19404910vv.LLILZLL = mChallenge8;
        c19404910vv.LLIZ = mHeaderParam;
        boolean z6 = true;
        if (mChallenge8.getCollectStatus() != 1) {
            z6 = false;
        }
        c19404910vv.LLIZLLLIL = z6;
        c19404910vv.LIZIZ();
        c19404910vv.LIZJ();
        View view = this.LLJLILLLLZIIL;
        if (view == null) {
            view = null;
        }
        HandlerHook.viewPost(view, new ARunnableS121S0100000_21(this, 97));
        ChallengeAnnouncement challengeAnnouncement = getMChallenge().getChallengeAnnouncement();
        if (challengeAnnouncement != null) {
            String title = challengeAnnouncement.getTitle();
            String content = challengeAnnouncement.getContent();
            if (!TextUtils.isEmpty(title) && !TextUtils.isEmpty(content)) {
                if (this.LLJLL == null) {
                    View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) findViewById(R.id.vs_announcement_container));
                    C1846400y9G c1846400y9G = new C1846400y9G();
                    c1846400y9G.LJI((ViewStub) viewLJLLLL.findViewById(R.id.vs_announcement_description_container));
                    Challenge mChallenge9 = getMChallenge();
                    if (mChallenge9 != null) {
                        c1846400y9G.LIZ(2, content, new C19225510Jh(c1846400y9G, mChallenge9));
                    }
                    this.LLJLL = viewLJLLLL;
                    this.LLJLLIL = (TextView) findViewById(R.id.dn1);
                    this.LLJLLL = findViewById(R.id.mph);
                }
                View view2 = this.LLJLLL;
                if (view2 == null) {
                    view2 = null;
                }
                if (TextUtils.isEmpty(getMChallenge().getDesc())) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, view2);
                TextView textView17 = this.LLJLLIL;
                if (textView17 == null) {
                    textView17 = null;
                }
                textView17.setText(title);
                C786410Ut5.LJLLLLLL(0, this.LLJLL);
                return;
            }
        }
        View view3 = this.LLJLL;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view3);
    }

    @Override // X.AbstractC19417810y0
    public final void LIZLLL(String str) {
        String string;
        String str2 = getMHeaderParam().LJFF;
        String cid = getMChallenge().getCid();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("process_id", str2);
        c2344009Gk.LJIIIIZZ("tag_id", cid);
        C20684815ws.LJIILLIIL("tag_detail_click_icon", c2344009Gk.LIZ);
        IChallengeDetailLegacyService iChallengeDetailLegacyServiceLIZ = ChallengeDetailLegacyServiceImpl.LIZ();
        C19EG activity = getActivity();
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJIJL(c627150Oin.LIZ, "extra_zoom_info", ZoomAnimationUtils.LIZ(getMAvatar()));
        c627150Oin.LIZ.putFloat("wh_ratio", 0.1f);
        c627150Oin.LIZ.putBoolean("enable_download_img", false);
        C786410Ut5.LJJIZ(c627150Oin.LIZ, "challenge_info", getMChallenge());
        C786410Ut5.LJJJI("process_id", getMHeaderParam().LJFF, c627150Oin.LIZ);
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(str)) {
            string = new Uri.Builder().scheme("res").path(String.valueOf(R.drawable.cg4)).build().toString();
        } else {
            string = str;
        }
        strArr[0] = string;
        c627150Oin.LIZ.putStringArray("uri", strArr);
        if (TextUtils.isEmpty(str)) {
            c627150Oin.LIZ.putBoolean("use_default_challenge_placeholder", true);
        }
        iChallengeDetailLegacyServiceLIZ.LJIILLIIL(activity, c627150Oin.LIZ);
    }

    public C19417710xz(Context context, C19406610wC c19406610wC) {
        super(context, c19406610wC, null);
    }

    public static String LJFF(int i, String str, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, Math.max(i - 1, 1)));
            sbLIZ.append("... ");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str.substring(0, Math.max(i, 1)));
        sbLIZ2.append("...");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
