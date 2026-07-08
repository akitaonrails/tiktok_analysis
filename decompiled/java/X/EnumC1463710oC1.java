package X;

/* JADX INFO: renamed from: X.0oC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public enum EnumC1463710oC1 {
    ConfigID_UseImageAllocator("UseImageAllocator"),
    ConfigID_PreLoadNextClip("PreLoadNextClip"),
    ConfigID_EnableHighSpeedChange("vesdk_high_speed_change_opt"),
    ConfigID_EnableEditorFpsLog("EnableEditorFpsLog"),
    ConfigID_EnableVideoOutputCallback("EnableVideoOutputCallback"),
    ConfigID_MaxAudioReaderCount("MaxAudioReaderCount"),
    ConfigID_MaxSoftwareVideoReaderCount("MaxSoftwareVideoReaderCount"),
    ConfigID_MaxSoftwareFreeReaderCount("MaxSoftwareFreeReaderCount"),
    ConfigID_MaxPreloadReaderCount("veabtest_crossplat_maxPreloadReaderCnt"),
    ConfigID_MaxHwReaderCount("MaxHwReaderCount"),
    ConfigID_MaxImageTextureBufferCount("MaxImageTextureBufferCount"),
    ConfigID_SetDropFramePara("SetDropFramePara"),
    ConfigID_DelayTimeThreshold("DelayTimeThreshold"),
    ConfigID_MaxDropFrameCount("MaxDropFrameCount"),
    ConfigID_MaxTexturePoolCount("MaxTexturePoolCount"),
    ConfigID_TexturePoolCleanCount("TexturePoolCleanCount"),
    ConfigID_UseMultiThreadPool("UseMultiThreadPool"),
    ConfigID_MaxImageTextureBufferWidth("MaxImageTextureBufferWidth"),
    ConfigID_MaxImageTextureBufferHeight("MaxImageTextureBufferHeight"),
    ConfigID_MaxCacheFrameCount("vesdk_max_cache_count"),
    ConfigID_UseEffectTransiton("UseEffectTransiton"),
    ConfigID_UseRefaCanvasWrap("UseRefaCanvasWrap"),
    ConfigID_EnbaleInfoStickerTrans("EnbaleInfoStickerTrans"),
    ConfigID_OpenSeekTimeOpt("OpenSeekTimeOpt"),
    ConfigID_UseNewEngineEffectOpt("UseNewEngineEffectOpt"),
    ConfigID_OutResolutionBase4("ve_enable_render_encode_resolution_align4"),
    ConfigID_ForceDropFrameWithoutAudio("ForceDropFrameWithoutAudio"),
    ConfigID_UseAudioSDKApiV2("aeabtest_v2api"),
    ConfigID_CrossplatGLBaseFBO("crossplat_glbase_fbo"),
    ConfigID_EnableRenderlib("enable_render_lib"),
    ConfigID_RenderlibFBOOpt("renderlib_fbo_opt"),
    ConfigID_EnableAGFXContext("EnableAGFXContext"),
    ConfigID_EnableAGFXMetal("vesdk_use_agfxmetal"),
    ConfigID_LoadImageOptimize("LoadImageOptimize"),
    ConfigID_GraphRefactor("s_bGraphRefactor"),
    ConfigID_CompileProbeEnableByte264("compile_probe_use_byte264"),
    configID_CompileProbeCrf("compile_probe_crf"),
    configID_CompileProbeIntervalFrame("compile_probe_interval_frame"),
    configID_CompileProbeSleepTime("compile_probe_sleep_time"),
    ConfigID_EnableByte264("use_byte264"),
    ConfigID_NewAudioMixer("vesdk_audiomix_replace"),
    ConfigID_AudioHwEncoder("vesdk_audio_hw_encoder"),
    ConfigID_SetStickerResolutionWithHeight("SetStickerResolutionWithHeight"),
    ConfigID_EnableMultiThreadDecode("EnableMultiThreadDecode"),
    ConfigID_EnableHWPlaybackDropFrame("ve_enable_hwdecode_playback_dropframe_opt"),
    ConfigID_EnableSeekAndPreloadOpt("EnableSeekAndPreloadOpt"),
    ConfigID_EnableHdrVsOptimization("veabtest_hdr_vs_optimization"),
    ConfigID_EnableApplHdrSupport("vesdk_enable_apple_hdr_support"),
    ConfigID_PinRefactor("ve_enable_pin_refactor"),
    ConfigID_EnablePBO("EnablePBO"),
    ConfigID_EnableHdrToneMapping("EnableHdrToneMapping"),
    ConfigID_EnableDisplayP3Render("EnableDisplayP3Render"),
    ConfigID_EnableAudioDisplayCallBack("EnableAudioDisplayCallBack"),
    ConfigID_EnableTransitionKeyframe("EnableTransitionKeyframe"),
    ConfigID_EnableCrossplatInputCompile("EnableCrossplatInputCompile"),
    ConfigID_EnableRemuxInfoColorSpace("enable_remux_color_info"),
    ConfigID_CompileReport("ve_compile_report"),
    ConfigID_EnableiOSEditFirstFrameOpt("veabtest_crossplatEditFirstFrameOptimize"),
    ConfigID_EnableSkipUnitPassthrough("EnableSkipUnitPassthrough"),
    ConfigID_ForceDetectFace("ve_enable_face_detection"),
    ConfigID_EnableStickerAmazing("EnableStickerAmazing"),
    ConfigID_EnableGlobalEffect("EnableGlobalEffect"),
    ConfigID_ForceDisableGlobalEffect("ForceDisableGlobalEffect"),
    ConfigID_EnableAdaptiveEncodeLevel("ve_enable_adaptive_encode_level"),
    ConfigID_EnableLimitMinEncodeFps("ve_enable_limit_min_encode_fps"),
    ConfigID_EncoderQPRange("ve_encoder_qp_range"),
    ConfigID_EncoderQPRangeForRecorder("ve_encoder_qp_range_for_recorder"),
    ConfigID_EncoderInitialQP("ve_encoder_initial_qp"),
    ConfigID_CompileRemuxBitrateJson("ve_compile_remux_bitrate_json"),
    ConfigID_EnableImportParallelCompile("veEnableImportParallelCompile"),
    ConfigID_EnableBufferEncodeOperatingRate("ve_enable_encode_buffer_operating_rate"),
    ConfigID_CropEncodeOperatingRate("ve_crop_encode_operating_rate"),
    ConfigID_StickerPinPreviewMode("StickerPinPreviewMode"),
    ConfigID_VeabtestEnableupsamplingopt("veabtest_enableUpSamplingOpt"),
    ConfigID_VeabtestEnablepreviewqualityopt("veabtest_enablePreviewQualityOpt"),
    ConfigID_VeabtestEnablecrossplatcanvasopt("veabtest_enableCrossplatCanvasOpt"),
    ConfigID_VeabtestEnablecrossplatcanvasdownscaleopt("veabtest_enableCrossplatCanvasDownscaleOpt"),
    ConfigID_VeContentAdaptiveCodingMode("ve_content_adaptive_coding_mode"),
    ConfigID_VeFFmpegCodecMemReuse("ve_ffmpeg_codec_mem_reuse"),
    ConfigID_GlobalEffectMode("GlobalEffectMode"),
    ConfigID_EnableCompileParamDump("ve_enable_compile_param_dump"),
    ConfigID_encodeColorSpaceBt601("ve_encode_color_space_bt601"),
    ConfigID_EnableSeekNoiseOpt("veabtest_enable_seek_noise_opt"),
    ConfigID_Enable_DecodeAVSync("veabtest_decode_av_sync"),
    ConfigID_EnableRenderlayerMemoryManagerOpt("ve_enable_Renderlayer_MemoryManager_Opt"),
    ConfigID_EnableRenderlayerPreloadCountOpt("ve_enable_Renderlayer_PreloadCount_Opt"),
    ConfigID_FixAudioDriveEOS("veabtest_fixAudioDriveEOS");

    public final String LL;

    public String value() {
        return this.LL;
    }

    public static EnumC1463710oC1 valueOf(String str) {
        return (EnumC1463710oC1) C08FF.LIZ(EnumC1463710oC1.class, str);
    }

    EnumC1463710oC1(String str) {
        this.LL = str;
    }
}
