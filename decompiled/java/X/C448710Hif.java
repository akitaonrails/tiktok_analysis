package X;

/* JADX INFO: renamed from: X.0Hif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448710Hif {
    public final C448700Hie LIZ = new C448700Hie();

    public final C448700Hie LIZ() {
        C448700Hie c448700Hie = this.LIZ;
        c448700Hie.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{   \"version\": \"1.0\",   \"mode\":    2,   \"name\":    \"AlgorithmGraph_ecRgUcf7dhb9dzco8d9bfb5dccWd\",   \"size\":    {      \"width\":   0,      \"height\":  0   },   \"nodes\":   [{         \"name\":    \"blit_0\",         \"type\":    \"blit\",         \"config\":  {            \"keyMaps\": {               \"intParam\":    {               },               \"floatParam\":  {               },               \"stringParam\": {               },               \"pathParam\":   {               }            }         }      }, {         \"name\":    \"enigma\",         \"type\":    \"enigma\",         \"config\":  {            \"keyMaps\": {               \"intParam\":    {                  \"enigma_scan_mode\": ");
        sbLIZ.append(c448700Hie.LIZ);
        sbLIZ.append(",                  \"enigma_run_mode\": ");
        sbLIZ.append(c448700Hie.LIZJ ? 1 : 0);
        sbLIZ.append(",                  \"enigma_enhance_camera\": ");
        sbLIZ.append(c448700Hie.LJ ? 1 : 0);
        sbLIZ.append(",                  \"enigma_auto_zoom_in\": ");
        sbLIZ.append(c448700Hie.LJI ? 1 : 0);
        sbLIZ.append(",                  \"enigma_decode_multiple\": ");
        sbLIZ.append(c448700Hie.LJII ? 1 : 0);
        sbLIZ.append(",                  \"enigma_code_type\": ");
        sbLIZ.append(c448700Hie.LIZIZ);
        sbLIZ.append(",                  \"enigma_enable_rf\": 1,                  \"enigma_call_type\": 0               },               \"floatParam\":  {               },               \"stringParam\": {               }            }         }      }],   \"links\":   [{      \"fromNode\":    \"blit_0\",      \"fromIndex\":   0,      \"toNode\":  \"enigma\",      \"toIndex\": 0   }]}");
        c448700Hie.algorithmConfig = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("config json:\n");
        sbLIZ2.append(c448700Hie.algorithmConfig);
        C2484209oO.LIZ("VEBachQRCodeParam", C2188811AlT.LIZIZ(sbLIZ2));
        return this.LIZ;
    }
}
