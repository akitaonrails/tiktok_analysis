package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem;
import com.ss.android.ugc.aweme.aigc.asynctask.DraftQueryTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.DraftQueryTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.SummaryCompositionTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTosTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchSeparatePollingTaskFromServerTaskExperiment;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LQK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC1294060jmO
public final class C0LQK {
    public static final C0LQK LIZ = new C0LQK();

    @InterfaceC1294060jmO
    public static C0LTN LIZ(String str) {
        if (Intrinsics.LJFF(str, C0LQP.I2V.getTypeName())) {
            return new C543210LSd();
        }
        if (Intrinsics.LJFF(str, C0LQP.TRANSITION_FRAME.getTypeName())) {
            return new C543200LSc();
        }
        C0LQP c0lqp = C0LQP.TEMPLATE_FL2V;
        if (Intrinsics.LJFF(str, c0lqp.getTypeName())) {
            return new C543190LSb(c0lqp.getTypeName());
        }
        C0LQP c0lqp2 = C0LQP.TEMPLATE_I2I;
        if (Intrinsics.LJFF(str, c0lqp2.getTypeName())) {
            return new C543190LSb(c0lqp2.getTypeName());
        }
        if (Intrinsics.LJFF(str, C0LQP.GENERAL_I2V.getTypeName())) {
            return new C0LRF();
        }
        if (Intrinsics.LJFF(str, C0LQP.AI_LIVE_I2V.getTypeName())) {
            return new C543160LRy();
        }
        if (Intrinsics.LJFF(str, C0LQP.EDITOR_PRO_AIGC_T2I.getTypeName())) {
            return new AbstractC543030LRl<PublicTaskInput, Object>() { // from class: X.0LMA
                @Override // X.AbstractC543030LRl
                public final void LJJJJL() {
                    ((ArrayList) this.LJIIIZ).add(new C0LNN(new C543990LVd(), C0LM6.SERVER));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJLL() {
                    LJJJJLI(new C0LMK(new C541640LMc(), C0LM6.DOWNLOAD));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJZ() {
                    LJJJJZI(new C0LL4(new C541280LKs(), C0LM6.IMAGE_UPLOAD));
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.EDITOR_PRO_AIGC_T2V.getTypeName())) {
            return new AbstractC543030LRl<PublicTaskInput, Object>() { // from class: X.0LM9
                public final String LJIJJ = C0LQP.EDITOR_PRO_AIGC_T2V.getTypeName();

                @Override // X.AbstractC543030LRl
                public final void LJJJJJL() {
                    ((ArrayList) this.LJIIJJI).add(new C0LLK(new C0LLP(), C0LM6.STEP_DEFAULT));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJL() {
                    ((ArrayList) this.LJIIIZ).add(new C0LNN(new C543970LVb(), C0LM6.SERVER));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJLL() {
                    LJJJJLI(new C0LMK(new C541640LMc(), C0LM6.DOWNLOAD));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJZ() {
                    LJJJJZI(new C0LL4(new C541280LKs(), C0LM6.IMAGE_UPLOAD));
                }

                @Override // X.AbstractC543030LRl, X.C0LTN
                public final String LJJ() {
                    return this.LJIJJ;
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.EDITOR_PRO_AIGC_V2V.getTypeName())) {
            return new AbstractC543030LRl<PublicTaskInput, Object>() { // from class: X.0LM8
                public final String LJIJJ = C0LQP.EDITOR_PRO_AIGC_V2V.getTypeName();

                @Override // X.AbstractC543030LRl
                public final void LJJJJJL() {
                    ((ArrayList) this.LJIIJJI).add(new C0LLK(new C0LLP(), C0LM6.STEP_DEFAULT));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJL() {
                    ((ArrayList) this.LJIIIZ).add(new C0LNN(new C543980LVc(), C0LM6.SERVER));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJLL() {
                    LJJJJLI(new C0LMK(new C541640LMc(), C0LM6.DOWNLOAD));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJZ() {
                    LJJJJZI(new AbstractC542960LRe<ImageUploadTaskInput, ImageUploadTaskOutput>(new C541400LLe(), C0LM6.IMAGE_UPLOAD) { // from class: X.0LL5
                        public final C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> LIZLLL;
                        public final C0LM6 LJ;

                        @Override // X.AbstractC542960LRe
                        public final C0LM6 LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> LIZLLL() {
                            return this.LIZLLL;
                        }

                        {
                            super(c541400LLe, c0lm6);
                            this.LIZLLL = c541400LLe;
                            this.LJ = c0lm6;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
                            List<String> listLIZIZ;
                            CommonParentTaskInput commonParentTaskInputLIZ;
                            String creationId;
                            Source source = c0lsz.LJIIL;
                            CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
                            if (commonParentTaskInput == null || (listLIZIZ = commonParentTaskInput.LIZIZ()) == null) {
                                listLIZIZ = C13BV.INSTANCE;
                            }
                            ParentTaskInput parentTaskInput = publicTaskInput.parentTaskInput;
                            CommonParentTaskInput commonParentTaskInput2 = parentTaskInput.commonParentTaskInput;
                            if (commonParentTaskInput2 != null) {
                                CreativeInfo creativeInfo = parentTaskInput.creativeInfo;
                                if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                                    creationId = "";
                                }
                                commonParentTaskInputLIZ = CommonParentTaskInput.LIZ(commonParentTaskInput2, null, null, creationId, false, false, null, 1073733631);
                            } else {
                                commonParentTaskInputLIZ = null;
                            }
                            return new ImageUploadTaskInput(source, listLIZIZ, "", commonParentTaskInputLIZ, null, 16, null);
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            ImageUploadTaskOutput imageUploadTaskOutput = (ImageUploadTaskOutput) absTaskOutput;
                            if (imageUploadTaskOutput != null) {
                                publicTaskInput.childTaskOutPut.imageUploadTaskOutput = new ImageUploadTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, null, imageUploadTaskOutput.imageXIdList, null, imageUploadTaskOutput.imageUploadDuration, 40, null);
                                String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                                return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "IMAGE_UPLOAD", 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427199);
                            }
                            return null;
                        }
                    });
                }

                @Override // X.AbstractC543030LRl, X.C0LTN
                public final String LJJ() {
                    return this.LJIJJ;
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.AUTO_CUT_AGENT.getTypeName())) {
            return new AbstractC543030LRl<PublicTaskInput, Object>() { // from class: X.0LJy
                public final String LJIJJ = C0LQP.AUTO_CUT_AGENT.getTypeName();
                public final C099F LJIJJLI = C090F.LIZIZ();

                @Override // X.AbstractC543030LRl
                public final void LJJJJJL() {
                    final C0LKL c0lkl = new C0LKL();
                    final C099F c099f = this.LJIJJLI;
                    ((ArrayList) this.LJIIJJI).add(new AbstractC542960LRe<FrameUploadTaskInput, FrameUploadTaskOutput>(c0lkl, c099f) { // from class: X.0LK7
                        public final C05XL<FrameUploadTaskOutput> LIZLLL;

                        {
                            super(new C0LKE(c0lkl, c099f), C0LM6.FRAME_UPLOAD);
                            this.LIZLLL = c099f;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
                        @Override // X.AbstractC542960LRe
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final X.C09JG LIZJ(X.C0LSZ r15, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r16) {
                            /*
                                r14 = this;
                                r1 = r16
                                com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r1.parentTaskInput
                                com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r0.creativeInfo
                                r7 = 0
                                if (r0 == 0) goto L42
                                java.lang.String r9 = r0.getCreationId()
                            Ld:
                                java.lang.String r5 = ""
                                if (r9 != 0) goto L12
                                r9 = r5
                            L12:
                                com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r1.parentTaskInput
                                com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r6 = r0.commonParentTaskInput
                                if (r6 == 0) goto L3f
                                java.util.List<com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem> r4 = r6.compositionMediaItems
                                if (r4 == 0) goto L40
                                boolean r0 = r4.isEmpty()
                                if (r0 != 0) goto L40
                                r0 = 0
                            L23:
                                java.lang.String r3 = "AutoPickFrameUploadBgTask"
                                if (r0 == 0) goto L44
                                X.0LKH r1 = X.C0LKH.LIZIZ
                                java.lang.String r0 = "getInput: mediaItems is null or empty"
                                X.C201955140j.LIZLLL(r1, r3, r0)
                                X.05XL<com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput> r4 = r14.LIZLLL
                                com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput r3 = new com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput
                                java.lang.String r2 = "FAILED"
                                r1 = 7106(0x1bc2, float:9.958E-42)
                                java.lang.String r0 = "mediaItems is null or empty"
                                r3.<init>(r2, r1, r0, r5)
                                r4.LJIIZILJ(r3)
                                return r7
                            L3f:
                                r4 = r7
                            L40:
                                r0 = 1
                                goto L23
                            L42:
                                r9 = r7
                                goto Ld
                            L44:
                                X.0LKH r2 = X.C0LKH.LIZIZ
                                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                java.lang.String r0 = "getInput: mediaItems count="
                                r1.append(r0)
                                int r0 = r4.size()
                                r1.append(r0)
                                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                X.C201955140j.LIZLLL(r2, r3, r0)
                                com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput r1 = new com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput
                                com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r15.LJIIL
                                if (r6 == 0) goto L6e
                                r10 = 0
                                r13 = 1073733631(0x3fffdfff, float:1.9990233)
                                r8 = r7
                                r11 = r10
                                r12 = r7
                                com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r7 = com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput.LIZ(r6, r7, r8, r9, r10, r11, r12, r13)
                            L6e:
                                r1.<init>(r0, r4, r9, r7)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0LK7.LIZJ(X.0LSZ, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput):X.09JG");
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            FrameUploadTaskOutput frameUploadTaskOutput = (FrameUploadTaskOutput) absTaskOutput;
                            String str2 = "";
                            if (frameUploadTaskOutput == null) {
                                frameUploadTaskOutput = new FrameUploadTaskOutput("FAILED", 7106, "output is null", "");
                            }
                            C0LKH c0lkh = C0LKH.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("saveOutput: status=");
                            sbLIZ.append(frameUploadTaskOutput.LIZ);
                            sbLIZ.append(", zipUrl=");
                            sbLIZ.append(frameUploadTaskOutput.zipUrl);
                            C201955140j.LIZLLL(c0lkh, "AutoPickFrameUploadBgTask", C2188811AlT.LIZIZ(sbLIZ));
                            publicTaskInput.childTaskOutPut.frameUploadTaskOutput = new FrameUploadTaskOutput(frameUploadTaskOutput.LIZ, frameUploadTaskOutput.LIZIZ, frameUploadTaskOutput.LIZJ, frameUploadTaskOutput.zipUrl);
                            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                            if (strLIZIZ != null) {
                                str2 = strLIZIZ;
                            }
                            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, str2, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
                        }
                    });
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJL() {
                    ((ArrayList) this.LJIIIZ).add(new AbstractC542960LRe<AutoCutServerTaskInput, AutoCutServerTaskOutput>(new C541110LKb(), C0LM6.SERVER) { // from class: X.0LJw
                        public final C0LTN<AutoCutServerTaskInput, AutoCutServerTaskOutput> LIZLLL;
                        public final C0LM6 LJ;

                        @Override // X.AbstractC542960LRe
                        public final C0LM6 LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LTN<AutoCutServerTaskInput, AutoCutServerTaskOutput> LIZLLL() {
                            return this.LIZLLL;
                        }

                        {
                            super(c541110LKb, c0lm6);
                            this.LIZLLL = c541110LKb;
                            this.LJ = c0lm6;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:26:0x0039 A[PHI: r11
                          0x0039: PHI (r11v5 java.lang.String) = (r11v0 java.lang.String), (r11v6 java.lang.String) binds: [B:25:0x0037, B:23:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[PHI: r11
                          0x003d: PHI (r11v4 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String) binds: [B:25:0x0037, B:27:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0041 A[PHI: r10 r11
                          0x0041: PHI (r10v0 java.lang.String) = (r10v3 java.lang.String), (r10v4 java.lang.String) binds: [B:29:0x003f, B:27:0x003b] A[DONT_GENERATE, DONT_INLINE]
                          0x0041: PHI (r11v1 java.lang.String) = (r11v4 java.lang.String), (r11v5 java.lang.String) binds: [B:29:0x003f, B:27:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x0045 A[PHI: r10 r11
                          0x0045: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:31:0x0043, B:29:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x0045: PHI (r11v3 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:31:0x0043, B:29:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x005f A[PHI: r8
                          0x005f: PHI (r8v5 java.lang.String) = (r8v0 java.lang.String), (r8v7 java.lang.String) binds: [B:41:0x005d, B:39:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x0075 A[PHI: r7 r8
                          0x0075: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:73:0x00ef, B:47:0x0073] A[DONT_GENERATE, DONT_INLINE]
                          0x0075: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:73:0x00ef, B:47:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0083 A[PHI: r7 r8
                          0x0083: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String), (r7v3 java.lang.String) binds: [B:73:0x00ef, B:49:0x0077, B:51:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0083: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String), (r8v4 java.lang.String) binds: [B:73:0x00ef, B:49:0x0077, B:51:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0095 A[PHI: r5
                          0x0095: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:58:0x0093, B:56:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x0099 A[PHI: r5
                          0x0099: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:58:0x0093, B:60:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:72:0x00ee A[PHI: r8
                          0x00ee: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String), (r8v5 java.lang.String), (r8v5 java.lang.String) binds: [B:41:0x005d, B:43:0x0061, B:45:0x006b, B:47:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // X.AbstractC542960LRe
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final X.C09JG LIZJ(X.C0LSZ r39, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r40) {
                            /*
                                Method dump skipped, instruction units count: 249
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C541060LJw.LIZJ(X.0LSZ, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput):X.09JG");
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            AutoCutServerTaskOutput autoCutServerTaskOutput = (AutoCutServerTaskOutput) absTaskOutput;
                            if (autoCutServerTaskOutput != null) {
                                publicTaskInput.childTaskOutPut.autoCutServerTaskOutput = new AutoCutServerTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, c0lsz.LJIJ, "", autoCutServerTaskOutput.requestId, autoCutServerTaskOutput.nleDraft, autoCutServerTaskOutput.musicInfo, autoCutServerTaskOutput.autoPickTaskResponses);
                                String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                                return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
                            }
                            return null;
                        }
                    });
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJLL() {
                    LJJJJLI(new C541040LJu(new C0LGV(), C0LM6.NLE_RESTORE));
                    LJJJJLI(new C541050LJv(new C539380LDk(), C0LM6.UPDATE_DRAFT));
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJZ() {
                    LJJJJZI(new AbstractC542960LRe<C539310LDd, SummaryCompositionTaskOutput>(new C539320LDe(), C0LM6.COMPOSITION) { // from class: X.0LJr
                        public final C0LTN<C539310LDd, SummaryCompositionTaskOutput> LIZLLL;
                        public final C0LM6 LJ;

                        @Override // X.AbstractC542960LRe
                        public final C0LM6 LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LTN<C539310LDd, SummaryCompositionTaskOutput> LIZLLL() {
                            return this.LIZLLL;
                        }

                        {
                            super(c539320LDe, c0lm6);
                            this.LIZLLL = c539320LDe;
                            this.LJ = c0lm6;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
                            List<CompositionMediaItem> list;
                            String creationId;
                            CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
                            if (commonParentTaskInput != null && (list = commonParentTaskInput.compositionMediaItems) != null && !list.isEmpty()) {
                                CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
                                if (((creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) && (creationId = commonParentTaskInput.creationId) == null) || a0.LJJJIL(creationId)) {
                                    return null;
                                }
                                return new C539310LDd(list, C14D2.LIZ(new CreativeInfo(creationId, 0, null, 6, null)).LJ().getAbsolutePath(), creationId);
                            }
                            return null;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            SummaryCompositionTaskOutput summaryCompositionTaskOutput = (SummaryCompositionTaskOutput) absTaskOutput;
                            if (summaryCompositionTaskOutput == null) {
                                return null;
                            }
                            publicTaskInput.childTaskOutPut.compositionTaskOutput = summaryCompositionTaskOutput;
                            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                            if (strLIZIZ == null) {
                                strLIZIZ = "";
                            }
                            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "COMPOSITION", 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427199);
                        }
                    });
                    final C0LKQ c0lkq = new C0LKQ();
                    final C0LM6 c0lm6 = C0LM6.VIDEO_UPLOAD;
                    LJJJJZI(new AbstractC542960LRe<VideoUploadTaskInput, VideoUploadTosTaskOutput>(c0lkq, c0lm6) { // from class: X.0LJz
                        public final C0LTN<VideoUploadTaskInput, VideoUploadTosTaskOutput> LIZLLL;
                        public final C0LM6 LJ;

                        @Override // X.AbstractC542960LRe
                        public final C0LM6 LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LTN<VideoUploadTaskInput, VideoUploadTosTaskOutput> LIZLLL() {
                            return this.LIZLLL;
                        }

                        {
                            super(c0lkq, c0lm6);
                            this.LIZLLL = c0lkq;
                            this.LJ = c0lm6;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
                            String creationId;
                            CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
                            CommonParentTaskInput commonParentTaskInputLIZ = null;
                            if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                                creationId = "";
                            }
                            SummaryCompositionTaskOutput summaryCompositionTaskOutput = publicTaskInput.childTaskOutPut.compositionTaskOutput;
                            if (summaryCompositionTaskOutput == null) {
                                return null;
                            }
                            CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
                            Source source = c0lsz.LJIIL;
                            String str2 = summaryCompositionTaskOutput.outputPath;
                            if (commonParentTaskInput != null) {
                                commonParentTaskInputLIZ = CommonParentTaskInput.LIZ(commonParentTaskInput, null, null, creationId, false, false, null, 1073733631);
                            }
                            return new VideoUploadTaskInput(source, str2, creationId, commonParentTaskInputLIZ);
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            VideoUploadTosTaskOutput videoUploadTosTaskOutput = (VideoUploadTosTaskOutput) absTaskOutput;
                            if (videoUploadTosTaskOutput != null) {
                                publicTaskInput.childTaskOutPut.videoUploadTaskOutput = new VideoUploadTosTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, videoUploadTosTaskOutput.vid);
                                String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                                return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "VIDEO_UPLOAD", 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427199);
                            }
                            return null;
                        }
                    });
                    LJJJJZI(new AbstractC542960LRe<DraftQueryTaskInput, DraftQueryTaskOutput>(new C0L43(), C0LM6.DRAFT_QUERY) { // from class: X.0LJs
                        public final C0LTN<DraftQueryTaskInput, DraftQueryTaskOutput> LIZLLL;
                        public final C0LM6 LJ;

                        @Override // X.AbstractC542960LRe
                        public final C0LM6 LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LTN<DraftQueryTaskInput, DraftQueryTaskOutput> LIZLLL() {
                            return this.LIZLLL;
                        }

                        {
                            super(c0l43, c0lm6);
                            this.LIZLLL = c0l43;
                            this.LJ = c0lm6;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
                        @Override // X.AbstractC542960LRe
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final X.C09JG LIZJ(X.C0LSZ r7, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r8) {
                            /*
                                r6 = this;
                                com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r8.parentTaskInput
                                com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r0.creativeInfo
                                r1 = 0
                                if (r0 == 0) goto L1e
                                java.lang.String r5 = r0.getCreationId()
                                if (r5 == 0) goto L1f
                                boolean r0 = kotlin.text.a0.LJJJIL(r5)
                                if (r0 != 0) goto L1f
                                r0 = 0
                            L14:
                                java.lang.String r4 = "NormalChildTaskDraftQuery"
                                if (r0 == 0) goto L21
                                java.lang.String r0 = "getInput: creationId is null or blank, skipping DraftQuery"
                                X.C201955140j.LJIJ(r4, r0)
                                return r1
                            L1e:
                                r5 = r1
                            L1f:
                                r0 = 1
                                goto L14
                            L21:
                                com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r8.parentTaskInput
                                com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r3 = r0.commonParentTaskInput
                                X.0LKH r2 = X.C0LKH.LIZIZ
                                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                java.lang.String r0 = "getInput: creationId="
                                r1.append(r0)
                                r1.append(r5)
                                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                X.C201955140j.LIZLLL(r2, r4, r0)
                                com.ss.android.ugc.aweme.aigc.asynctask.DraftQueryTaskInput r1 = new com.ss.android.ugc.aweme.aigc.asynctask.DraftQueryTaskInput
                                com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r7.LJIIL
                                r1.<init>(r0, r5, r3)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C541020LJs.LIZJ(X.0LSZ, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput):X.09JG");
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            DraftQueryTaskOutput draftQueryTaskOutput = (DraftQueryTaskOutput) absTaskOutput;
                            if (draftQueryTaskOutput == null) {
                                return null;
                            }
                            C0LKH c0lkh = C0LKH.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("saveOutput: status=");
                            sbLIZ.append(draftQueryTaskOutput.LIZ);
                            sbLIZ.append(", contentType=");
                            sbLIZ.append(draftQueryTaskOutput.contentType);
                            sbLIZ.append(", contentSource=");
                            sbLIZ.append(draftQueryTaskOutput.contentSource);
                            sbLIZ.append(", shootWay=");
                            sbLIZ.append(draftQueryTaskOutput.shootWay);
                            C201955140j.LIZLLL(c0lkh, "NormalChildTaskDraftQuery", C2188811AlT.LIZIZ(sbLIZ));
                            publicTaskInput.childTaskOutPut.draftQueryTaskOutput = new DraftQueryTaskOutput(draftQueryTaskOutput.LIZ, draftQueryTaskOutput.LIZIZ, draftQueryTaskOutput.LIZJ, draftQueryTaskOutput.contentType, draftQueryTaskOutput.contentSource, draftQueryTaskOutput.shootWay);
                            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                            if (strLIZIZ == null) {
                                strLIZIZ = "";
                            }
                            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
                        }
                    });
                    final C099F c099f = this.LJIJJLI;
                    LJJJJZI(new AbstractC542960LRe<C09JG, FrameUploadTaskOutput>(c099f) { // from class: X.0LK8
                        {
                            super(new C0LTN<C09JG, FrameUploadTaskOutput>(c099f) { // from class: X.0LK9
                                public final C05XL<FrameUploadTaskOutput> LJIIIIZZ;
                                public final String LJIIIZ = "WaitFrameUploadTask";

                                @Override // X.C0LTN
                                public final String LJJ() {
                                    return this.LJIIIZ;
                                }

                                {
                                    this.LJIIIIZZ = c099f;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
                                @Override // X.C0LTN, X.InterfaceC542770LQl
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object LJFF(X.C09JG r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput> r9) {
                                    /*
                                        r7 = this;
                                        boolean r0 = r9 instanceof X.C0LKA
                                        if (r0 == 0) goto L22
                                        r4 = r9
                                        X.0LKA r4 = (X.C0LKA) r4
                                        int r2 = r4.LLILLL
                                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r0 = r2 & r1
                                        if (r0 == 0) goto L22
                                        int r2 = r2 - r1
                                        r4.LLILLL = r2
                                    L12:
                                        java.lang.Object r6 = r4.LL
                                        java.lang.Object r3 = X.C099R.LJFF()
                                        int r0 = r4.LLILLL
                                        r2 = 1
                                        java.lang.String r5 = "WaitFrameUploadTask"
                                        if (r0 == 0) goto L30
                                        if (r0 != r2) goto L28
                                        goto L45
                                    L22:
                                        X.0LKA r4 = new X.0LKA
                                        r4.<init>(r7, r9)
                                        goto L12
                                    L28:
                                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                        r1.<init>(r0)
                                        throw r1
                                    L30:
                                        X.C155000ia.LIZIZ(r6)
                                        X.0LKH r1 = X.C0LKH.LIZIZ
                                        java.lang.String r0 = "run: waiting for BackgroundTask to complete..."
                                        X.C201955140j.LIZLLL(r1, r5, r0)
                                        X.05XL<com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput> r0 = r7.LJIIIIZZ     // Catch: java.lang.Exception -> L79
                                        r4.LLILLL = r2     // Catch: java.lang.Exception -> L79
                                        java.lang.Object r6 = r0.LJLIIIL(r4)     // Catch: java.lang.Exception -> L79
                                        if (r6 != r3) goto L48
                                        return r3
                                    L45:
                                        X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L79
                                    L48:
                                        com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput r6 = (com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput) r6     // Catch: java.lang.Exception -> L79
                                        X.0LKH r2 = X.C0LKH.LIZIZ     // Catch: java.lang.Exception -> L79
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L79
                                        java.lang.String r0 = "run: BackgroundTask completed, status="
                                        r1.append(r0)     // Catch: java.lang.Exception -> L79
                                        java.lang.String r0 = r6.LIZ     // Catch: java.lang.Exception -> L79
                                        r1.append(r0)     // Catch: java.lang.Exception -> L79
                                        java.lang.String r0 = ", zipUrl="
                                        r1.append(r0)     // Catch: java.lang.Exception -> L79
                                        java.lang.String r0 = r6.zipUrl     // Catch: java.lang.Exception -> L79
                                        r1.append(r0)     // Catch: java.lang.Exception -> L79
                                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L79
                                        X.C201955140j.LIZLLL(r2, r5, r0)     // Catch: java.lang.Exception -> L79
                                        com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput r4 = new com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput     // Catch: java.lang.Exception -> L79
                                        java.lang.String r3 = "FINISHED"
                                        int r2 = r6.LIZIZ     // Catch: java.lang.Exception -> L79
                                        java.lang.String r1 = r6.LIZJ     // Catch: java.lang.Exception -> L79
                                        java.lang.String r0 = r6.zipUrl     // Catch: java.lang.Exception -> L79
                                        r4.<init>(r3, r2, r1, r0)     // Catch: java.lang.Exception -> L79
                                        return r4
                                    L79:
                                        r2 = move-exception
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        java.lang.String r0 = "run: await failed: "
                                        r1.append(r0)
                                        java.lang.String r0 = r2.getMessage()
                                        r1.append(r0)
                                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                        X.C201955140j.LJFF(r5, r0)
                                        com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput r4 = new com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        java.lang.String r0 = "Wait for frame upload failed: "
                                        r1.append(r0)
                                        java.lang.String r0 = r2.getMessage()
                                        r1.append(r0)
                                        java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
                                        java.lang.String r2 = ""
                                        java.lang.String r1 = "FAILED"
                                        r0 = 7104(0x1bc0, float:9.955E-42)
                                        r4.<init>(r1, r0, r3, r2)
                                        return r4
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C0LK9.LJFF(X.09JG, X.05Vn):java.lang.Object");
                                }
                            }, C0LM6.WAIT_FRAME_UPLOAD);
                        }

                        @Override // X.AbstractC542960LRe
                        public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
                            return new C09JG() { // from class: X.0LKB
                            };
                        }

                        @Override // X.AbstractC542960LRe
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            FrameUploadTaskOutput frameUploadTaskOutput = (FrameUploadTaskOutput) absTaskOutput;
                            if (frameUploadTaskOutput == null) {
                                return null;
                            }
                            C0LKH c0lkh = C0LKH.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("saveOutput: status=");
                            sbLIZ.append(frameUploadTaskOutput.LIZ);
                            sbLIZ.append(", zipUrl=");
                            sbLIZ.append(frameUploadTaskOutput.zipUrl);
                            C201955140j.LIZLLL(c0lkh, "WaitFrameUploadTask", C2188811AlT.LIZIZ(sbLIZ));
                            publicTaskInput.childTaskOutPut.frameUploadTaskOutput = new FrameUploadTaskOutput(frameUploadTaskOutput.LIZ, frameUploadTaskOutput.LIZIZ, frameUploadTaskOutput.LIZJ, frameUploadTaskOutput.zipUrl);
                            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                            if (strLIZIZ == null) {
                                strLIZIZ = "";
                            }
                            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
                        }
                    });
                }

                @Override // X.AbstractC543030LRl, X.C0LTN
                public final String LJJ() {
                    return this.LJIJJ;
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
                @Override // X.AbstractC543030LRl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C0LSZ LJJLIIIIJ(X.C0LSZ r35, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r36) {
                    /*
                        Method dump skipped, instruction units count: 337
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C541080LJy.LJJLIIIIJ(X.0LSZ, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput):X.0LSZ");
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.AUTO_CUT_AGENT_POST_MOCK.getTypeName())) {
            return new AbstractC543030LRl<PublicTaskInput, Object>() { // from class: X.0LJx
                public final String LJIJJ = C0LQP.AUTO_CUT_AGENT_POST_MOCK.getTypeName();

                @Override // X.AbstractC543030LRl
                public final void LJJJJL() {
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJZ() {
                }

                @Override // X.AbstractC543030LRl
                public final void LJJJJLL() {
                    LJJJJLI(new C541040LJu(new C0LGV(), C0LM6.NLE_RESTORE));
                    LJJJJLI(new C541050LJv(new C539380LDk(), C0LM6.UPDATE_DRAFT));
                }

                @Override // X.AbstractC543030LRl, X.C0LTN
                public final String LJJ() {
                    return this.LJIJJ;
                }

                @Override // X.AbstractC543030LRl, X.C0LTN, X.InterfaceC542770LQl
                public final Object LJFF(C09JG c09jg, InterfaceC1364105Vn<? super C1974607oO> interfaceC1364105Vn) {
                    PublicTaskInput publicTaskInput;
                    ChildTaskOutput childTaskOutput;
                    if ((c09jg instanceof PublicTaskInput) && (publicTaskInput = (PublicTaskInput) c09jg) != null && (childTaskOutput = publicTaskInput.childTaskOutPut) != null) {
                        childTaskOutput.autoCutServerTaskOutput = new AutoCutServerTaskOutput("FINISHED", 0, "", "", "", "", "__AUTOCUT_POST_MOCK_NLE_DRAFT__", null, null);
                    }
                    return AbstractC543030LRl.LJJLIIIJ(this, c09jg, interfaceC1364105Vn);
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.AIGC_WORKFLOW_I2V.getTypeName())) {
            return new C0LRR<PublicTaskInput, Object>() { // from class: X.0LQW
                @Override // X.C0LTN
                public final String LJJ() {
                    return C0LQP.AIGC_WORKFLOW_I2V.getTypeName();
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.AME_WORKFLOW_I2I.getTypeName())) {
            return new C0LRR<PublicTaskInput, Object>() { // from class: X.0LQH
                @Override // X.C0LTN
                public final String LJJ() {
                    return C0LQP.AME_WORKFLOW_I2I.getTypeName();
                }

                @Override // X.C0LRR
                public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LJJJJLI(String str2) {
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    c13dvLIZIZ.add(new C0LQC(new C0LST(), C0LM6.QUOTA));
                    c13dvLIZIZ.add(new C541500LLo(new C541350LKz(), C0LM6.IMAGE_UPLOAD));
                    c13dvLIZIZ.add(new C0LNO(new C543820LUm(), C0LM6.SERVER));
                    if (AigcArchSeparatePollingTaskFromServerTaskExperiment.isEnabled()) {
                        c13dvLIZIZ.add(new C0LNP(new C0LVI(), C0LM6.PROGRESS));
                    }
                    c13dvLIZIZ.add(new C0LML(new C541640LMc(), C0LM6.DOWNLOAD));
                    return C1697820uHc.LIZ(c13dvLIZIZ);
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.AI_THEATER.getTypeName())) {
            return new C0LQL();
        }
        if (Intrinsics.LJFF(str, C0LQP.AI_THEATER_AUTO.getTypeName())) {
            return new C0LQN();
        }
        if (Intrinsics.LJFF(str, C0LQP.AI_THEATER_DM.getTypeName())) {
            return new C0LQM();
        }
        if (Intrinsics.LJFF(str, C0LQP.CAMEO_ID_RECORD.getTypeName())) {
            return new C0LQO();
        }
        if (Intrinsics.LJFF(str, C0LQP.AME_WORKFLOW_V2V.getTypeName())) {
            return new C0LRR<PublicTaskInput, Object>() { // from class: X.0LQG
                @Override // X.C0LTN
                public final String LJJ() {
                    return C0LQP.AME_WORKFLOW_V2V.getTypeName();
                }

                @Override // X.C0LRR
                public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LJJJJLI(String str2) {
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    c13dvLIZIZ.add(new C0LQC(new C0LST(), C0LM6.QUOTA));
                    c13dvLIZIZ.add(new C541500LLo(new C541350LKz(), C0LM6.IMAGE_UPLOAD));
                    c13dvLIZIZ.add(new C0LNO(new C543820LUm(), C0LM6.SERVER));
                    if (AigcArchSeparatePollingTaskFromServerTaskExperiment.isEnabled()) {
                        c13dvLIZIZ.add(new C0LNP(new C0LVI(), C0LM6.PROGRESS));
                    }
                    c13dvLIZIZ.add(new C0LML(new C541640LMc(), C0LM6.DOWNLOAD));
                    return C1697820uHc.LIZ(c13dvLIZIZ);
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.AIME_WORKFLOW_I2I.getTypeName())) {
            return new C0LRR<PublicTaskInput, Object>() { // from class: X.0LQF
                @Override // X.C0LTN
                public final String LJJ() {
                    return C0LQP.AIME_WORKFLOW_I2I.getTypeName();
                }

                @Override // X.C0LRR
                public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LJJJJLI(String str2) {
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    c13dvLIZIZ.add(new C0LQC(new C0LST(), C0LM6.QUOTA));
                    c13dvLIZIZ.add(new C0LNO(new C543820LUm(), C0LM6.SERVER));
                    if (AigcArchSeparatePollingTaskFromServerTaskExperiment.isEnabled()) {
                        c13dvLIZIZ.add(new C0LNP(new C0LVI(), C0LM6.PROGRESS));
                    }
                    return C1697820uHc.LIZ(c13dvLIZIZ);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0166 A[RETURN] */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r1v11 */
                /* JADX WARN: Type inference failed for: r1v12 */
                /* JADX WARN: Type inference failed for: r1v13 */
                /* JADX WARN: Type inference failed for: r1v14 */
                /* JADX WARN: Type inference failed for: r1v15 */
                /* JADX WARN: Type inference failed for: r1v16 */
                /* JADX WARN: Type inference failed for: r1v3, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r1v4, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r1v5, types: [X.01eN] */
                @Override // X.C0LRR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJJJLIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r47) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 378
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0LQF.LJJJLIIL(X.05Vn):java.lang.Object");
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LQP.TEXT_TO_IMAGE.getTypeName())) {
            return new C0LRR<PublicTaskInput, Object>() { // from class: X.0LQZ
                public String LJIILLIIL;
                public String LJIIZILJ;
                public String LJIJ;
                public String LJIJI;
                public String LJIJJ;
                public Long LJIJJLI;

                @Override // X.C0LTN
                public final String LJJ() {
                    return C0LQP.TEXT_TO_IMAGE.getTypeName();
                }

                @Override // X.C0LRR
                public final int LJJJJZ() {
                    return Math.max(super.LJJJJZ(), this.LIZLLL.LJII);
                }

                @Override // X.C0LRR
                public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LJJJJLI(String str2) {
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    c13dvLIZIZ.add(new C0LNO(new C543750LUf(), C0LM6.SERVER));
                    c13dvLIZIZ.add(new C0LNP(new C544010LVf(), C0LM6.PROGRESS));
                    c13dvLIZIZ.add(new C0LML(new C541640LMc(), C0LM6.DOWNLOAD));
                    return C1697820uHc.LIZ(c13dvLIZIZ);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0186 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
                /* JADX WARN: Type inference failed for: r2v0 */
                /* JADX WARN: Type inference failed for: r2v1, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r2v10, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r2v12 */
                /* JADX WARN: Type inference failed for: r2v13 */
                /* JADX WARN: Type inference failed for: r2v14 */
                /* JADX WARN: Type inference failed for: r2v15 */
                /* JADX WARN: Type inference failed for: r2v3, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r2v4 */
                /* JADX WARN: Type inference failed for: r2v5, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r2v6, types: [X.01eN] */
                /* JADX WARN: Type inference failed for: r2v9, types: [X.01eN] */
                @Override // X.C0LRR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJJJLIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r23) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 418
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0LQZ.LJJJLIIL(X.05Vn):java.lang.Object");
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
                @Override // X.C0LRR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r37, X.InterfaceC1364105Vn<? super kotlin.Unit> r38) {
                    /*
                        Method dump skipped, instruction units count: 246
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0LQZ.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
                }
            };
        }
        if (Intrinsics.LJFF(str, C0LM5.EDITOR_PRO_T2I_SERVER.getTypeName())) {
            return new C543990LVd();
        }
        if (Intrinsics.LJFF(str, C0LM5.EDITOR_PRO_T2V_SERVER.getTypeName())) {
            return new C543970LVb();
        }
        if (Intrinsics.LJFF(str, C0LM5.EDITOR_PRO_R2V_SERVER.getTypeName())) {
            return new C543980LVc();
        }
        if (Intrinsics.LJFF(str, C0LM5.I2V_SERVER.getTypeName())) {
            return new C544000LVe();
        }
        if (Intrinsics.LJFF(str, C0LM5.GENERAL_I2V_SERVER.getTypeName())) {
            return new C543820LUm();
        }
        if (Intrinsics.LJFF(str, C0LM5.EDIT_I2V_SERVER.getTypeName())) {
            return new C0LVQ();
        }
        if (Intrinsics.LJFF(str, C0LM5.IMAGE_UPLOAD.getTypeName())) {
            return new C541280LKs();
        }
        if (Intrinsics.LJFF(str, C0LM5.AI_CREATION_CHECK_CAMEO_PERMISSION.getTypeName())) {
            return new C541920LNe();
        }
        if (Intrinsics.LJFF(str, C0LM5.AI_CREATION_MULTI_RESOURCE_UPLOAD.getTypeName())) {
            return new C541410LLf();
        }
        if (Intrinsics.LJFF(str, C0LM5.AI_CREATION_SERVER.getTypeName())) {
            return new C0LUW();
        }
        if (Intrinsics.LJFF(str, C0LM5.AI_CREATION_SERVER_PROGRESS.getTypeName())) {
            return new C0LV4();
        }
        if (Intrinsics.LJFF(str, C0LM5.AI_CREATION_DOWNLOAD_LIST.getTypeName())) {
            return new C541740LMm();
        }
        if (Intrinsics.LJFF(str, C0LM5.AI_CREATION_SAVE_DRAFT.getTypeName())) {
            return new C0LMB();
        }
        if (Intrinsics.LJFF(str, C0LM5.AUTOCUT_SERVER.getTypeName())) {
            return new C541110LKb();
        }
        if (Intrinsics.LJFF(str, new C0LKQ().LJIIIIZZ)) {
            return new C0LKQ();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<? extends X.InterfaceC542770LQl<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0LQT
            if (r0 == 0) goto L53
            r6 = r9
            X.0LQT r6 = (X.C0LQT) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 != r4) goto L5c
            java.lang.Object r3 = r6.LL
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r3.next()
            X.0LQl r2 = (X.InterfaceC542770LQl) r2
            X.0LSZ r0 = r2.LJIIIIZZ()
            java.lang.String r1 = r0.LJ
            java.lang.String r0 = "STARTED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L26
            r6.LL = r3
            r6.LLILZ = r4
            java.lang.Object r0 = r2.LIZIZ(r6)
            if (r0 != r5) goto L26
            return r5
        L4b:
            X.C155000ia.LIZIZ(r1)
            java.util.Iterator r3 = r8.iterator()
            goto L26
        L53:
            X.0LQT r6 = new X.0LQT
            r6.<init>(r7, r9)
            goto L12
        L59:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LQK.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r8, X.InterfaceC1364105Vn<? super X.InterfaceC542770LQl<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0LQS
            if (r0 == 0) goto L62
            r6 = r9
            X.0LQS r6 = (X.C0LQS) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L3b
            if (r0 == r2) goto L4b
            if (r0 != r3) goto L68
            X.0LQl r1 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L2a:
            return r1
        L2b:
            X.C155000ia.LIZIZ(r5)
            X.0LX1 r0 = X.C0LX2.LIZ()
            r6.LLILZ = r1
            java.lang.Object r5 = r0.LJIIL(r8, r6)
            if (r5 != r4) goto L3e
            return r4
        L3b:
            X.C155000ia.LIZIZ(r5)
        L3e:
            X.0LXL r5 = (X.C0LXL) r5
            if (r5 == 0) goto L70
            r6.LLILZ = r2
            java.lang.Object r5 = X.C0LXK.LIZ(r5, r6)
            if (r5 != r4) goto L4e
            return r4
        L4b:
            X.C155000ia.LIZIZ(r5)
        L4e:
            r1 = r5
            X.0LQl r1 = (X.InterfaceC542770LQl) r1
            if (r1 == 0) goto L70
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r6.LL = r1
            r6.LLILZ = r3
            java.lang.Object r0 = r7.LIZIZ(r0, r6)
            if (r0 != r4) goto L2a
            return r4
        L62:
            X.0LQS r6 = new X.0LQS
            r6.<init>(r7, r9)
            goto L12
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L70:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LQK.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<java.lang.String> r8, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC539460LDs<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0LQU
            if (r0 == 0) goto L5a
            r6 = r9
            X.0LQU r6 = (X.C0LQU) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L3b
            if (r0 == r2) goto L49
            if (r0 != r3) goto L60
            java.lang.Object r1 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L2a:
            return r1
        L2b:
            X.C155000ia.LIZIZ(r5)
            X.0LX1 r0 = X.C0LX2.LIZ()
            r6.LLILZ = r1
            java.lang.Object r5 = r0.LJIIJ(r8, r6)
            if (r5 != r4) goto L3e
            return r4
        L3b:
            X.C155000ia.LIZIZ(r5)
        L3e:
            java.util.List r5 = (java.util.List) r5
            r6.LLILZ = r2
            java.lang.Object r5 = X.C0LXK.LIZIZ(r5, r6)
            if (r5 != r4) goto L4c
            return r4
        L49:
            X.C155000ia.LIZIZ(r5)
        L4c:
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            r6.LL = r1
            r6.LLILZ = r3
            java.lang.Object r0 = r7.LIZIZ(r1, r6)
            if (r0 != r4) goto L2a
            return r4
        L5a:
            X.0LQU r6 = new X.0LQU
            r6.<init>(r7, r9)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LQK.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }
}
